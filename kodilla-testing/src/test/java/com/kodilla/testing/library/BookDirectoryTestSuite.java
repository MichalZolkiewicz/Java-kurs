package com.kodilla.testing.library;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class BookDirectoryTestSuite {

    @Mock
    private LibraryDatabase libraryDatabaseMock;

    @Test
    void testListBooksWithConditionsReturnList() {

        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

        //When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");
        
        //Then
        assertEquals(4, theListOfBooks.size());

    }

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int n = 1; n <=booksQuantity; n++) {
            Book theBook = new Book("Title" + n, "Author" + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    void testListBooksWithConditionMoreThan20() {

        // Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))
                .thenReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");
        // Then

        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    void testListBooksWithConditionFragmentShorterThen3() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        lenient().when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf10Books);

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        // Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    void testListBooksInHandsOfNone() {

        //Given
        LibraryUser libraryUser = new LibraryUser("Michał", "Żółkiewicz", "12345678910");
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        List<Book> listWith0Books = generateListOfNBooks(0);

        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(listWith0Books);

        //When

        List<Book> listWithBooks0 = bookLibrary.listBooksInHandsOf(libraryUser);

        //Then

        assertEquals(0, listWithBooks0.size());

    }

    @Test
    void testListBooksInHandsOfOneBook() {

        LibraryUser libraryUser = new LibraryUser("Michał", "Żółkiewicz", "12345678910");
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        List<Book> listWith1Book = generateListOfNBooks(1);

        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(listWith1Book);

        List<Book> listWithBook1 = bookLibrary.listBooksInHandsOf(libraryUser);

        assertEquals(1, listWithBook1.size());
    }

    @Test
    void testListBooksInHandsOfFiveBooks() {

        LibraryUser libraryUser = new LibraryUser("Michał", "Żółkiewicz", "12345678910");
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        List<Book> listWith5Books = generateListOfNBooks(5);

        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(listWith5Books);

        List<Book> listWithBooks5 = bookLibrary.listBooksInHandsOf(libraryUser);

        assertEquals(5, listWithBooks5.size());

    }

}
