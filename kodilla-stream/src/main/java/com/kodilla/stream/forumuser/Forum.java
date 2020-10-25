package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> theForumUsersList = new ArrayList<>();

    public Forum() {
        theForumUsersList.add(new ForumUser(0001, "Alfa", 'F', 1990, 5, 16, 2));
        theForumUsersList.add(new ForumUser(0002, "Bravo", 'M', 2010, 10,11, 10));
        theForumUsersList.add(new ForumUser(0003, "Charlie", 'M', 1994, 3, 12, 8));
        theForumUsersList.add(new ForumUser(0004, "Delta", 'F', 2001, 2, 1, 11));
        theForumUsersList.add(new ForumUser(0005, "Echo", 'M', 1991, 7, 12, 0));
        theForumUsersList.add(new ForumUser(0006, "Foxtrot", 'M', 1966, 10, 3,  3));
        theForumUsersList.add(new ForumUser(0007, "Golf", 'M', 2002, 5, 8, 2));
    }

    public List<ForumUser> getList() {
        return new ArrayList<>(theForumUsersList);
    }
}
