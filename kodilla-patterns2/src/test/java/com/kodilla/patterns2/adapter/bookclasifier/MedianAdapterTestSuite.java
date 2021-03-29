package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        Set<Book> books = new HashSet<>();
        MedianAdapter medianAdapter = new MedianAdapter();

        for (int n = 0; n < 12; n++) {
            books.add(new Book("author" + n, "title" + n, 2000 + n, "signature" + n));
        }

        int medianPublicationYear = medianAdapter.publicationYearMedian(books);


        System.out.println(medianPublicationYear);
        assertEquals(2006, medianPublicationYear);
    }

}