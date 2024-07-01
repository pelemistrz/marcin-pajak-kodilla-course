package com.kodilla.exception.nullpointer;

public class MessageSender {
    public void sendMessageTo(User user, String message) throws MessageNotSentException {
     if(user != null){
         System.out.println("Sending message to user " + user.getName() + " with message " + message);

     } else {
         throw new MessageNotSentException("Object User was null");
     }

    }
}
