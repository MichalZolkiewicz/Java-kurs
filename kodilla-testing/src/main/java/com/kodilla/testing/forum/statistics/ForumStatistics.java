package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    private int userCount;
    private int postsCount;
    private int commentsCount;
    private double avgPostPerUser;
    private double avgCommentsPerUser;
    private double avgCommentsPerPost;


    public int getUserCount() {
        return userCount;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public double getAvgPostPerUser() {
        return avgPostPerUser;
    }

    public double getAvgCommentsPerUser() {
        return avgCommentsPerUser;
    }

    public double getAvgCommentsPerPost() {
        return avgCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {

        userCount = statistics.usersNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();

        if(userCount > 0) {
            avgPostPerUser = (double) postsCount/ userCount;
            avgCommentsPerUser = (double) commentsCount/ userCount;
        }
        if(postsCount > 0) {
            avgCommentsPerPost = (double) commentsCount / postsCount;
        }
    }

    public void showStatistics() {

        System.out.print("Forum has #" + userCount + " users.");
        System.out.println("\nForum contains #" + postsCount + " posts.");
        System.out.println("All posts have #" + commentsCount + " comments.");
        System.out.println("Average of posts per user is " + avgPostPerUser);
        System.out.println("Average of comments per post is " + avgCommentsPerPost);
        System.out.println("Average of comments per user is " + avgCommentsPerUser);


    }
}
