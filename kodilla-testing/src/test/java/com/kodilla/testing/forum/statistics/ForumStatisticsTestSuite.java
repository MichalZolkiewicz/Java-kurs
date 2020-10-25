package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ForumStatisticsTestSuite {

    static int testCounter = 0;

    @BeforeAll
    static void beforeAll() {

        System.out.println("Commencing Forum Statistics test");
        System.out.println("");
    }

    @BeforeEach
    void beforeEach() {
        testCounter++;
        System.out.println("Commencing test #" + testCounter);
        System.out.println("");
    }

    @AfterEach
    void afterEach() {
        System.out.println("");
        System.out.println("Test #" + testCounter + " completed");
        System.out.println("");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("");
        System.out.println("All tests completed successfully");
    }
    @Mock
    private Statistics statisticsMock;

    @Test
    void testForumStatisticsWithEmptyForum() {

        //Given
        ForumStatistics forumStatistics = new ForumStatistics();

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();

        //Then
        assertEquals(0, forumStatistics.getUserCount());
        assertEquals(0, forumStatistics.getPostsCount());
        assertEquals(0, forumStatistics.getCommentsCount());
        assertEquals(0, forumStatistics.getAvgCommentsPerPost());
        assertEquals(0, forumStatistics.getAvgCommentsPerUser());
        assertEquals(0, forumStatistics.getAvgPostPerUser());

    }

    @Test
    void testForumStatisticsWith100Users() {

        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> listOfUsers = new ArrayList<>();
        for(int i=0; i<100; i++){
            listOfUsers.add("Random User");
        }

        when(statisticsMock.usersNames()).thenReturn(listOfUsers);

        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();

        assertEquals(100, forumStatistics.getUserCount());
        assertEquals(0, forumStatistics.getPostsCount());
        assertEquals(0, forumStatistics.getCommentsCount());
        assertEquals(0, forumStatistics.getAvgCommentsPerPost());
        assertEquals(0, forumStatistics.getAvgCommentsPerUser());
        assertEquals(0, forumStatistics.getAvgPostPerUser());
    }

    @Test
    void testForumStatisticsWith100UsersAnd1000Posts() {

        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> listOfUsers = new ArrayList<>();
        for(int i=0; i<100; i++){
            listOfUsers.add("Random User");
        }

        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.postsCount()).thenReturn(1000);

        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();

        assertEquals(100, forumStatistics.getUserCount());
        assertEquals(1000, forumStatistics.getPostsCount());
        assertEquals(0, forumStatistics.getCommentsCount());
        assertEquals(0, forumStatistics.getAvgCommentsPerPost());
        assertEquals(0, forumStatistics.getAvgCommentsPerUser());
        assertEquals(10, forumStatistics.getAvgPostPerUser());
    }

    @Test
    void testForumStatisticsWhenMorePostsThenComments() {

        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> listOfUsers = new ArrayList<>();
        for(int i=0; i<100; i++){
            listOfUsers.add("Random User");
        }

        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.postsCount()).thenReturn(1000);

        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();

        assertEquals(100, forumStatistics.getUserCount());
        assertEquals(1000, forumStatistics.getPostsCount());
        assertEquals(100, forumStatistics.getCommentsCount());
        assertTrue(forumStatistics.getAvgCommentsPerPost() < 1);
        assertEquals(1, forumStatistics.getAvgCommentsPerUser());
        assertEquals(10, forumStatistics.getAvgPostPerUser());
    }

    @Test
    void testForumStatisticsWhenMoreCommentsThenPosts() {

        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> listOfUsers = new ArrayList<>();
        for(int i=0; i<100; i++){
            listOfUsers.add("Random User");
        }

        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        when(statisticsMock.postsCount()).thenReturn(100);

        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();

        assertEquals(100, forumStatistics.getUserCount());
        assertEquals(100, forumStatistics.getPostsCount());
        assertEquals(1000, forumStatistics.getCommentsCount());
        assertEquals(forumStatistics.getAvgCommentsPerPost(), 10);
        assertEquals(10, forumStatistics.getAvgCommentsPerUser());
        assertEquals(1, forumStatistics.getAvgPostPerUser());
    }

}
