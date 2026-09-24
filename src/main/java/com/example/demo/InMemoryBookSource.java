package com.example.demo;

import java.util.List;

public class InMemoryBookSource implements BookSource {

    @Override
    public List<Book> load() {
        return List.of(
            new Book("Clean Code", 464),
            new Book("Effective Java", 412),
            new Book("The Pragmatic Programmer", 352)
        );
    }
}
