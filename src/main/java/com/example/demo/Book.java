package com.example.demo;

public record Book(String title, String author, int pages) {

    public boolean isLongBook() {
        return pages > 400;
    }
}