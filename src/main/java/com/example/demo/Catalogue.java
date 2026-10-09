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

    public List<String> titlesBy(String author) {
        return source.load().stream()
            .filter(book -> book.author().equals(author))
            .map(Book::title)
            .sorted()
            .toList();
    }
}
