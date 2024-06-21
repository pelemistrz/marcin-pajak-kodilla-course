package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import java.util.*;

import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        Forum theForum = new Forum();
        Map<Integer, ForumUser> theMapOfForumUser = theForum.getForumUsers().stream()
                .filter(u->u.getSex() == 'M')
                .filter(u->u.getBirthday().getYear() < 2014)
                .filter(u->u.getPostCount() > 0)
                .collect(Collectors.toMap(user -> user.getUserId(), user -> user));

        theMapOfForumUser.entrySet().stream()
                .forEach(System.out::println);
    }
}