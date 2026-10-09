package com.example.demo;

import java.util.List;

public class InMemoryBookSource implements BookSource {

    @Override
    public List<Book> load() {
        return List.of(
            new Book("Clean Code", "Robert C. Martin", 464),
            new Book("Effective Java", "Joshua Bloch", 412),
            new Book("The Pragmatic Programmer", "Andrew Hunt", 352)
        );
    }
}
