package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0){
            throw new ArithmeticException();
        }

        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        try {
            double result2 = firstChallenge.divide(3, 0);
        }catch (ArithmeticException exception) {
            System.out.println("Unfortunately I can't divide by 0. Error: " + exception);
        }finally{
            System.out.println("Math is not that complicated");
        }


    }
}
