package Test;

import org.junit.jupiter.api.Test;

import Model.Book;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    //test case for Book constructor
    @Test
    void testBookConstructor() {
        //create new Book obj
        Book book = new Book("The Alchemist", "Paulo Coelho", 10.99);
        
        //check if book obj is not null
        assertNotNull(book, "Book should be created");
        
        //check if title matches
        assertEquals("The Alchemist", book.getTitle(), "Title should match");
        
        //check if author matches
        assertEquals("Paulo Coelho", book.getAuthor(), "Author should match");
    }
}
