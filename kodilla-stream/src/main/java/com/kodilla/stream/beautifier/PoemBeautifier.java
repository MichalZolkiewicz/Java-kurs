package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void executeDecorate(String text, PoemDecorator poemDecorator) {
        String decorate = poemDecorator.decorate(text);
        System.out.println(decorate);
    }
}
