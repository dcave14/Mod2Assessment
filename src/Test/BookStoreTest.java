package Test;

import org.junit.jupiter.api.Test;

import Model.Book;
import Model.BookStore;

import static org.junit.jupiter.api.Assertions.*;

class BookStoreTest {

    //test case to verify addBook() method
    @Test
    void testAddBook() {
        BookStore store = new BookStore();
        store.addBook(new Book("1984", "George Orwell", 8.99));

        assertNotNull(store.findBookByTitle("1984"), "Book should be found");
    }

    //test case to verify findBookByTitle() method
    @Test
    void testFindBookByTitle() {
        BookStore store = new BookStore();
        store.addBook(new Book("1984", "George Orwell", 8.99));

        assertNull(store.findBookByTitle("Unknown"), "Book should not be found");
    }
}
