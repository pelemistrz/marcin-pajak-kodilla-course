package com.kodilla.hibernate.manytomany;

import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class Maximum {


    public static Integer getMaximum(List<Integer> list) {

        int max = Integer.MIN_VALUE;
        for (Integer i : list) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static Integer getMinimum(List<Integer> list) {
        int min = Integer.MAX_VALUE;
        for (Integer i : list) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public static Integer getSecondMaximum(List<Integer> list) {
        int max = Integer.MIN_VALUE;
        for (Integer i : list) {
            if (i > max) {
                max = i;
            }
        }
        int secondMax = Integer.MIN_VALUE;
        for (Integer i : list) {
            if(i>secondMax && i<max) {
                secondMax = i;
            }
        }
        return secondMax;
    }

    public static Integer getSecondMinimum(List<Integer> list) {
        int min = Integer.MAX_VALUE;
        for (Integer i : list) {
            if (i < min) {
                min = i;
            }
        }
        int secondMin = Integer.MAX_VALUE;
        for (Integer i : list) {
            if(i<secondMin && i>min) {
                secondMin = i;
            }
        }
        return secondMin;
    }
}
