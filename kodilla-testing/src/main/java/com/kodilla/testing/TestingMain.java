package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");
                String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("Test OK");
        }else{
            System.out.println("Error!");
        }

        Calculator calc = new Calculator();

        Integer sum = calc.add(3, 5);
        Integer difference = calc.subtract(5,7);

        if(sum != null && difference != null) {
                    System.out.println("Test OK" + " Sum = " + sum + " and difference = " + difference);
        }else{
            System.out.println("Error!");
        }

    }
}
