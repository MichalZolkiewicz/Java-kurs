package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(2, 1);
        }catch(Exception exception) {
            System.out.println("This will not work: " + exception);;
        }finally{
            System.out.println("This does not make any sense :(");
        }
    }
}
