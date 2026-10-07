package com.example.demo;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CsvBookSource implements BookSource {
    private final String resource;

    public CsvBookSource(String resource) {
        this.resource = resource;
    }

    @Override
    public List<Book> load() {
        List<Book> books = new ArrayList<>();
        try (InputStream is = getClass().getClassLoader().getResourceAsStream(resource);
             BufferedReader reader = new BufferedReader(new InputStreamReader(is))) {
            String line;
            boolean firstLine = true;
            while ((line = reader.readLine()) != null) {
                if (firstLine) {
                    firstLine = false;
                    continue;
                }
                String[] parts = line.split(",", 2);
                String title = parts[0].trim();
                int pages = Integer.parseInt(parts[1].trim());
                books.add(new Book(title, pages));
            }
        } catch (Exception e) {
            throw new RuntimeException("Failed to load CSV: " + resource, e);
        }
        return books;
    }
}
