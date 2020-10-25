package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.Objects;

public final class ForumUser {

    private final int userId;
    private final String userName;
    private final char userSex;
    private final LocalDate userDateOfBirth;
    private final int userPostAmount;

    public ForumUser(final int userId, final String userName, final char userSex,
                     final int yearOfBirth, final int monthOfBirth, final int dayOfBirth, final int userPostAmount) {
        this.userId = userId;
        this.userName = userName;
        this.userSex = userSex;
        this.userDateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.userPostAmount = userPostAmount;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getUserSex() {
        return userSex;
    }

    public LocalDate getUserDateOfBirth() {
        return userDateOfBirth;
    }

    public int getUserPostAmount() {
        return userPostAmount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userSex=" + userSex +
                ", userDateOfBirth=" + userDateOfBirth +
                ", userPostAmount=" + userPostAmount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForumUser forumUser = (ForumUser) o;
        return userId == forumUser.userId &&
                userSex == forumUser.userSex &&
                userPostAmount == forumUser.userPostAmount &&
                Objects.equals(userName, forumUser.userName) &&
                Objects.equals(userDateOfBirth, forumUser.userDateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userName, userSex, userDateOfBirth, userPostAmount);
    }
}
