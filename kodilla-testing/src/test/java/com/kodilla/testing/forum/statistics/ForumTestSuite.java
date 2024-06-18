package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.*;

import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ForumTestSuite {
    @Mock
    private Statistics statisticsMock;

    private static List<String> usersNames = new ArrayList<>();
    private static Forum forum;


    @BeforeAll
    static void setUp() {
        usersNames.add("Marcin");
        usersNames.add("John");
        usersNames.add("Jane");
        usersNames.add("Jack");
        usersNames.add("Bob");
        usersNames.add("Betty");
        usersNames.add("Johnson");
        usersNames.add("Jola");
        usersNames.add("Janet");
        usersNames.add("Jane");

        forum = new Forum();
    }



    @Test
    void testAdvStatisticsPostsCount0() {
        //Given
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(0);
        forum.calculateAdvStatistics(statisticsMock);

        //When
        double averagePostsPerUser = forum.getAveragePostsPerUser();
        double averageCommentsPerUser = forum.getAverageCommentsPerUser();
        double averageCommentsPerPost = forum.getAverageCommentsPerPost();

        //Then
        assertEquals(0,averagePostsPerUser);
        assertEquals(0,averageCommentsPerUser);
        assertEquals(0,averageCommentsPerPost);
    }
    @Test
    void testAdvStatisticsPostsCount100() {
        //Given
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(5);
        forum.calculateAdvStatistics(statisticsMock);

        //When
        double averagePostsPerUser = forum.getAveragePostsPerUser();
        double averageCommentsPerUser = forum.getAverageCommentsPerUser();
        double averageCommentsPerPost = forum.getAverageCommentsPerPost();

        //Then
        assertEquals(10,averagePostsPerUser);
        assertEquals(0.5,averageCommentsPerUser);
        assertEquals(0.05,averageCommentsPerPost);
    }
    @Test
    void testAdvStatisticsCommentsCount0() {
        //Given
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(0);
        forum.calculateAdvStatistics(statisticsMock);

        //When
        double averagePostsPerUser = forum.getAveragePostsPerUser();
        double averageCommentsPerUser = forum.getAverageCommentsPerUser();
        double averageCommentsPerPost = forum.getAverageCommentsPerPost();

        //Then
        assertEquals(10,averagePostsPerUser);
        assertEquals(0,averageCommentsPerUser);
        assertEquals(0,averageCommentsPerPost);
    }
    @Test
    void testAdvStatisticsMorePostsThanComments() {
        //Given
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(10);
        forum.calculateAdvStatistics(statisticsMock);

        //When
        double averagePostsPerUser = forum.getAveragePostsPerUser();
        double averageCommentsPerUser = forum.getAverageCommentsPerUser();
        double averageCommentsPerPost = forum.getAverageCommentsPerPost();

        //Then
        assertEquals(10,averagePostsPerUser);
        assertEquals(1,averageCommentsPerUser);
        assertEquals(0.1,averageCommentsPerPost);
    }
    @Test
    void testAdvStatisticsMoreCommentsThanPosts() {
        //Given
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(100);
        forum.calculateAdvStatistics(statisticsMock);

        //When
        double averagePostsPerUser = forum.getAveragePostsPerUser();
        double averageCommentsPerUser = forum.getAverageCommentsPerUser();
        double averageCommentsPerPost = forum.getAverageCommentsPerPost();

        //Then
        assertEquals(0,averagePostsPerUser);
        assertEquals(0,averageCommentsPerUser);
        assertEquals(0,averageCommentsPerPost);
    }

    @Test
    void testAdvStatisticsNumberOfUsers0(){
        //Given
        List<String> usersNames = new ArrayList<>();
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(0);
        forum.calculateAdvStatistics(statisticsMock);

        //When
        double averagePostsPerUser = forum.getAveragePostsPerUser();
        double averageCommentsPerUser = forum.getAverageCommentsPerUser();
        double averageCommentsPerPost = forum.getAverageCommentsPerPost();

        //Then
        assertEquals(0,averagePostsPerUser);
        assertEquals(0,averageCommentsPerUser);
        assertEquals(0,averageCommentsPerPost);
    }
    @Test
    void testAdvStatisticsNumberOfUsers100(){
        //Given
        List<String> usersNames = new ArrayList<>();
        for(int i = 1; i <= 100; i++){
            usersNames.add("User number " +i);
        }
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(100);
        forum.calculateAdvStatistics(statisticsMock);

        //When
        double averagePostsPerUser = forum.getAveragePostsPerUser();
        double averageCommentsPerUser = forum.getAverageCommentsPerUser();
        double averageCommentsPerPost = forum.getAverageCommentsPerPost();

        //Then
        assertEquals(0.1,averagePostsPerUser);
        assertEquals(1,averageCommentsPerUser);
        assertEquals(10,averageCommentsPerPost);
    }
}
