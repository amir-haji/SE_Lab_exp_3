package test.classes;

import main.classes.Book;
import main.classes.Library;
import main.classes.SearchByType;
import main.classes.Student;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class LibraryTest {

    private Library library;
    @Before
    public void setup() {
        library = new Library();

        Book book1 = new Book("Book-1", "Author-1", 10);
        Book book2 = new Book("Book-2", "Author-2", 11);
        Book book3 = new Book("Book-3", "Author-3", 12);
        Book book4 = new Book("Book-4", "Author-1", 13);
        Book book5 = new Book("Not-owned-book", "Author-1", 15);

        Student student1 = new Student("Alice", 10);
        Student student2 = new Student("Bob", 11);
        Student student3 = new Student("John", 12);
        Student student4 = new Student("Not-registered-student", 13);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        library.addStudent(student1);
        library.addStudent(student2);
        library.addStudent(student3);

    }

    @Test
    public void searchStudentsWithAuthorAndTitleSearchType() {
        var keys = new ArrayList<Object>();
        keys.add(15);
        var result = library.searchStudents(SearchByType.TITLE, keys);
        Assert.assertNull(result);

        result = library.searchStudents(SearchByType.AUTHOR, keys);
        Assert.assertNull(result);
    }

    @Test
    public void searchStudentsWithIDSearchType() {
        var keys = new ArrayList<Object>(Arrays.asList(10, 11));
        var result = library.searchStudents(SearchByType.ID, keys);
        var foundIds = new ArrayList<Object>();
        for (Student s: result) {
            foundIds.add(s.getId());
        }
        Assert.assertArrayEquals(keys.toArray(), foundIds.toArray());
    }

    @Test
    public void searchStudentsWithNameSearchType() {
        var keys = new ArrayList<Object>(Arrays.asList("John", "Bob"));
        var result = library.searchStudents(SearchByType.NAME, keys);
        var foundIds = new ArrayList<Object>();
        for (Student s: result) {
            foundIds.add(s.getName());
        }
        keys.sort(null);
        foundIds.sort(null);
        Assert.assertArrayEquals(keys.toArray(), foundIds.toArray());
    }

    @Test
    public void searchStudentsForNotRegisteredStudent() {
        var keys = new ArrayList<Object>(Arrays.asList(15));
        var result = library.searchStudents(SearchByType.ID, keys);

        Assert.assertEquals(0, result.size());
    }

    @Test
    public void searchBooksWithNameSearchType() {
        var keys = new ArrayList<Object>(Arrays.asList(10, 11));
        var result = library.searchBooks(SearchByType.NAME, keys);

        Assert.assertNull(result);
    }

    @Test
    public void searchBooksWithIdSearchType() {
        var keys = new ArrayList<Object>(Arrays.asList(10, 11));
        var result = library.searchBooks(SearchByType.ID, keys);
        var foundIds = new ArrayList<Object>();
        for (Book book: result) {
            foundIds.add(book.getId());
        }
        keys.sort(null);
        foundIds.sort(null);
        Assert.assertArrayEquals(keys.toArray(), foundIds.toArray());
    }

    @Test
    public void searchBooksWithTitleSearchType() {
        var keys = new ArrayList<Object>(Arrays.asList("Book-3", "Book-1", "Book-4"));
        var result = library.searchBooks(SearchByType.TITLE, keys);
        var foundTitles = new ArrayList<Object>();
        for (Book book: result) {
            foundTitles.add(book.getTitle());
        }

        keys.sort(null);
        foundTitles.sort(null);
        Assert.assertArrayEquals(keys.toArray(), foundTitles.toArray());
    }

    @Test
    public void searchBooksWithAuthorSearchType() {
        var keys = new ArrayList<Object>(Arrays.asList("Author-3", "Author-1"));
        var expectedIds = new ArrayList<Object>(Arrays.asList(10, 12, 13));
        var result = library.searchBooks(SearchByType.AUTHOR, keys);
        var foundAuthors = new ArrayList<Object>();
        var foundIds = new ArrayList<Object>();
        for (Book book: result) {
            if(!foundAuthors.contains(book.getAuthor())) {
                foundAuthors.add(book.getAuthor());
            }

            if(!foundIds.contains(book.getId())) {
                foundIds.add(book.getId());
            }
        }
        keys.sort(null);
        expectedIds.sort(null);
        foundAuthors.sort(null);
        foundIds.sort(null);

        Assert.assertArrayEquals(keys.toArray(), foundAuthors.toArray());
        Assert.assertArrayEquals(expectedIds.toArray(), foundIds.toArray());
    }

    @Test
    public void searchBooksThatAreNotRegistered() {
        var keys = new ArrayList<Object>(Arrays.asList(15));
        var result = library.searchStudents(SearchByType.ID, keys);

        Assert.assertEquals(0, result.size());
    }

    @Test
    public void searchBooksThatAreLent() {
        Student student = new Student("Ali", 14);
        Book book = new Book("Book-5", "Author-5", 14);

        library.addStudent(student);
        library.addBook(book);
        library.lendBook(book, student);

        var keys = new ArrayList<Object>(Arrays.asList(14));
        var result = library.searchBooks(SearchByType.ID, keys);

        Assert.assertEquals(0, result.size());
    }


}