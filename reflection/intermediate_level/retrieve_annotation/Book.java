package java_collections_streams.reflection.intermediate_level.retrieve_annotation;

import javax.naming.Name;

@Author(name = "Ruskin Bond")
public class Book {
    private String bookName;

    public Book(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName(String name) {
        return bookName;
    }
}
