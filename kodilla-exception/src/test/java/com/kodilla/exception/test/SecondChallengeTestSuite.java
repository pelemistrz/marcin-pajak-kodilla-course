package com.kodilla.exception.test;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuite {
    @Test
    public void testProbablyIWillThrowExcepiton() {
        //given
        SecondChallenge secondChallenge = new SecondChallenge();
        //when & then
        assertAll(
                ()->assertThrows(Exception.class,()->secondChallenge.probablyIWillThrowException(3,2)),
                ()->assertDoesNotThrow(()->secondChallenge.probablyIWillThrowException(1.5,3)),
                ()->assertThrows(Exception.class,()->secondChallenge.probablyIWillThrowException(1.5,1.5))
        );
        
    }
}
