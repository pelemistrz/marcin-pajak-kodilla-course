package com.kodilla.exception.nullpointer;

public class NullPointerExceptionRunner {
    public static void main(String[] args) {
        User user = null;
        MessageSender messageSender = new MessageSender();
        try{
            messageSender.sendMessageTo(user,"Hello!");
        } catch (Exception e){
            System.out.println("Messege not send bu program still running");
        }
        System.out.println("Processing other logic");
    }
}
