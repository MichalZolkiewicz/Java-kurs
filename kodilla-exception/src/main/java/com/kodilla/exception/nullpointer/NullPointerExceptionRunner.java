package com.kodilla.exception.nullpointer;

public class NullPointerExceptionRunner {

    public static void main(String[] args) {

        User user = null;

        MessageSender messageSender = new MessageSender();

        try{
            messageSender.sendMessageTo(user, "Hello!");
        }catch(MessageNotSentException exception) {
            System.out.println("Message is not send, but the program is still running very well.");
        }finally {
            System.out.println("Processing other logic!");
        }
    }
}