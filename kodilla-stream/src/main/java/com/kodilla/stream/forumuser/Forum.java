package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
   private List<ForumUser> forumUsers = new ArrayList<>();

    public Forum() {
        forumUsers.add(new ForumUser(1,"marcin",'M', LocalDate.parse("1986-01-15"),15));
        forumUsers.add(new ForumUser(2,"tymek ",'M', LocalDate.parse("2000-01-15"),0));
        forumUsers.add(new ForumUser(3,"milosz",'M', LocalDate.parse("2005-01-15"),7));
        forumUsers.add(new ForumUser(4,"jolanta",'F', LocalDate.parse("2006-01-15"),0));
        forumUsers.add(new ForumUser(5,"hanna",'F', LocalDate.parse("1999-01-15"),7));
        forumUsers.add(new ForumUser(6,"urszula",'F', LocalDate.parse("2012-01-15"),20));
        forumUsers.add(new ForumUser(7,"stanislaw",'M', LocalDate.parse("1964-01-15"),25));
        forumUsers.add(new ForumUser(8,"karolina",'F', LocalDate.parse("2016-01-15"),0));
        forumUsers.add(new ForumUser(9,"dorota",'F', LocalDate.parse("1990-01-15"),7));

    }

    public List<ForumUser> getForumUsers() {
        return forumUsers;
    }
}
