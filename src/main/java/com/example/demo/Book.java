package com.example.demo;

public record Book(String title, int pages) {

    public boolean isLongBook() {
        return pages > 400;
    }
}
