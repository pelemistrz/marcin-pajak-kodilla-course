package com.kodilla.testing.loop;

import org.junit.jupiter.api.Test;

public class TestLoopAndConditionalBreakpoinst {
    @Test
    public void test() {
        long sum=0;
        for(int i=1;i<=1000;i++) {
            sum+=i;
            System.out.println(sum);
        }
    }
}
