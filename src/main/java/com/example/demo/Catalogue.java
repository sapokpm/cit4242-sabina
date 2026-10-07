package com.example.demo;

import java.util.List;

public class Catalogue {
    private final BookSource source;

    public Catalogue(BookSource source) {
        this.source = source;
    }

    public List<Book> getAllBooks() {
        return source.load();
    }
}
