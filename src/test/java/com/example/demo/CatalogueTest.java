package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;

class CatalogueTest {

    @Test
    void catalogueWorksWithInMemorySource() {
        BookSource source = new InMemoryBookSource();
        Catalogue catalogue = new Catalogue(source);
        assertFalse(catalogue.getAllBooks().isEmpty());
    }
}
