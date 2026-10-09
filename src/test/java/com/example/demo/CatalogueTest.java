package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;

class CatalogueTest {

    @Test
    void catalogueWorksWithInMemorySource() {
        BookSource source = new InMemoryBookSource();
        Catalogue catalogue = new Catalogue(source);
        assertFalse(catalogue.getAllBooks().isEmpty());
    }

    @Test
    void titlesByReturnsEmptyListForUnknownAuthor() {
        Catalogue catalogue = new Catalogue(new InMemoryBookSource());
        List<String> result = catalogue.titlesBy("Nobody Real");
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    void titlesByReturnsTitlesForKnownAuthor() {
        Catalogue catalogue = new Catalogue(new InMemoryBookSource());
        assertEquals(List.of("Effective Java"), catalogue.titlesBy("Joshua Bloch"));
    }
}
