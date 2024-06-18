package com.kodilla.testing.forum.statistics;

public class Forum {

    int numberOfUsers;
    int numberOfPosts;
    int numberOfComments;
    double averagePostsPerUser;
    double averageCommentsPerUser;
    double averageCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics){
       int numberOfUsers = statistics.usersNames().size();

        this.numberOfUsers = numberOfUsers;
        this.numberOfPosts = statistics.postsCount();
        this.numberOfComments = statistics.commentsCount();
        if(numberOfUsers == 0) {
            this.averagePostsPerUser = 0;
        } else {
            this.averagePostsPerUser= (double) statistics.postsCount()/numberOfUsers;
        }
        if(numberOfUsers == 0){
            this.averageCommentsPerUser = 0;
        } else {
            this.averageCommentsPerUser = (double) statistics.commentsCount() / numberOfUsers;
        }
        if(statistics.postsCount() == 0){
            this.averageCommentsPerPost = 0;
        } else {
            this.averageCommentsPerPost = (double) statistics.commentsCount() / statistics.postsCount();
        }
    }


    public void showStatistics(){
        System.out.println("Number of users: " + numberOfUsers);
        System.out.println("Number of posts: " + numberOfPosts);
        System.out.println("Number of comments: " + numberOfComments);
        System.out.println("Average posts per user: " + averagePostsPerUser);
        System.out.println("Average comments per user: " + averageCommentsPerUser);
        System.out.println("Average comments per post: " + averageCommentsPerPost);
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }
}
