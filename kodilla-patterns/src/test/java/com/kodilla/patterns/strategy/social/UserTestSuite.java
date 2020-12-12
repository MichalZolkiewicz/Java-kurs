package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User john = new Millenials("John Smith");
        User bill = new YGeneration("Bill Clint");
        User north = new ZGeneration("North West");

        //When
        String johnWillPost = john.sharePost();
        System.out.println("John will post: " + johnWillPost);
        String billWillPost = bill.sharePost();
        System.out.println("Bill will post: " + billWillPost);
        String northWillPost = north.sharePost();
        System.out.println("North will post: " + northWillPost);

        //Then
        assertEquals("[Facebook Publisher] Using Facebook to share posts", johnWillPost);
        assertEquals("[Twitter Publisher] Using Twitter to share posts", billWillPost);
        assertEquals("[Snapchat Publisher] Using Snapchat to share posts", northWillPost);
    }

    @Test
    void testIndividualSharingStrategies() {
        //Given
        User john = new Millenials("John Smith");

        //When
        String johnWillPost = john.sharePost();
        System.out.println("John is posting by: " + johnWillPost);
        john.setSocialPublisher(new TwitterPublisher());
        johnWillPost = john.sharePost();
        System.out.println("John is now posting by: " + johnWillPost);

        assertEquals("[Twitter Publisher] Using Twitter to share posts", johnWillPost);
    }
}
