package test;

import main.classes.Book;
import main.classes.Library;
import main.classes.Student;
import org.junit.Test;
import static org.junit.Assert.*;

public class LendBookTest {

    @Test
    public void testLendBookToUnregisteredStudent() {
        Library library = new Library();

        Book book1 = new Book("Book-1", "Author-1", 10);
        Student student1 = new Student("Alice", 10);

        library.addBook(book1);

        boolean result = library.lendBook(book1, student1);

        assertFalse(result);
    }

    @Test
    public void testLendBookToRegisteredStudent() {
        Library library = new Library();

        Book book1 = new Book("Book-1", "Author-1", 10);
        Student student1 = new Student("Alice", 10);

        library.addBook(book1);
        library.addStudent(student1);

        boolean result = library.lendBook(book1, student1);

        assertTrue(result);
        assertTrue(student1.hasBook(book1));
    }
}
