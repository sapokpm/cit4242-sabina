@Test
void catalogueWorksWithInMemorySource() {
    BookSource source = new InMemoryBookSource();
    Catalogue catalogue = new Catalogue(source);
    assertFalse(catalogue.getAllBooks().isEmpty());
}