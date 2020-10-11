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

        int sum = calc.addAToB(3, 5);
        int difference = calc.subtractAFromB(5,7);

        if(sum == 8) {
                    System.out.println("Test addAToB OK!");
        }else{
            System.out.println("Error!");
        }

        if(difference == -2) {
            System.out.println("Test subtractAFromB OK!");
        }else{
            System.out.println("Error!");
        }
    }
}
