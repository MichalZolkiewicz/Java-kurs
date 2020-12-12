package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //Given
        Library library1 = new Library("number 1");
        IntStream.iterate(1, n -> n + 1)
                .limit(5)
                .forEach(n -> library1.getBooks().add(new Book("Title", "Author", LocalDate.of(2000 + n, 1 + n,10))));

        Library clonedLibrary = null;
        try {
            clonedLibrary = library1.shallowCopy();
            clonedLibrary.setName("number 2");
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library1.deepCopy();
            deepClonedLibrary.setName("number 3");
        }catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        //Given
        System.out.println(library1);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        assertEquals(5, library1.getBooks().size());
        assertEquals(5, clonedLibrary.getBooks().size());
        assertEquals(5, deepClonedLibrary.getBooks().size());
        assertNotEquals(deepClonedLibrary.getBooks(), library1.getBooks());
        assertEquals(clonedLibrary.getBooks(), library1.getBooks());
    }
}
