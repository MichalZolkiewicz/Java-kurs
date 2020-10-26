package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.person.People;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {
    public static void main(String[] args) {

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10,5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10,5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10,5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10,5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::divideAByB);

        //DECORATOR

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        System.out.println("\nThis is text to decorate");
        poemBeautifier.executeDecorate("This is text to decorate", text -> text.toUpperCase());
        poemBeautifier.executeDecorate("This is text to decorate", text -> "ABC" + text + "ABC");
        poemBeautifier.executeDecorate("This is text to decorate", text -> text.toLowerCase());
        poemBeautifier.executeDecorate("This is text to decorate", text -> text + text);

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

        System.out.println();
        People.getList().stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .filter(s -> s.substring(0, 1).equals("M"))
                .forEach(s -> System.out.println(s));

        BookDirectory theBookDirectory = new BookDirectory();
        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        System.out.println("# elements: " + theResultMapOfBooks.size());
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

        System.out.println();

        //7.3 ForumUser list - Map stream ///////////////////////////

        Forum theForum = new Forum();
        Map<Integer, ForumUser> theFilteredMapOfUsers = theForum.getList().stream()
                .filter(forumUser -> forumUser.getUserSex() == 'M')
                .filter(forumUser -> forumUser.getUserDateOfBirth().isBefore(LocalDate.now().minusYears(20)))
                .filter(forumUser -> forumUser.getUserPostAmount() > 0)
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));

        System.out.println("# elements: " + theFilteredMapOfUsers.size());
        theFilteredMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
