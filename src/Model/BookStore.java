package Model;

import java.util.ArrayList;
import java.util.List;

public class BookStore {
    private List<Book> books = new ArrayList<>();

    //method to add book to bookstore
    public void addBook(Book book) {
        books.add(book);
    }

    //method to find book by its title
    public Book findBookByTitle(String title) {
        return books.stream()
                .filter(book -> book.getTitle().equals(title))
                .findFirst()
                .orElse(null);
    }
}
