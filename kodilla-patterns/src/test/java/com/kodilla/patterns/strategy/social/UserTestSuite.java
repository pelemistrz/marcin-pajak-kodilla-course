package com.kodilla.patterns.strategy.social;


import com.kodilla.patterns.strategy.social.publisher.SnapchatPublisher;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategy() {
        //given
        User steven = new Millenials("Steven Links");
        User john = new YGeneration("John Hemerald");
        User alice = new ZGeneration("Alice McMillan");
        //when
        String stevenShare = steven.sharePost();
        String johnShare = john.sharePost();
        String aliceShare = alice.sharePost();
        //then
        assertEquals("Snapchat publisher",aliceShare);
        assertEquals("Twitter publisher",johnShare);
        assertEquals("Facebook publisher",stevenShare);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //given
        User steven = new Millenials("Steven Links");
        //when
        steven.setSocialPublisher(new SnapchatPublisher());
        //then
        assertEquals("Snapchat publisher",steven.sharePost());
    }
}
