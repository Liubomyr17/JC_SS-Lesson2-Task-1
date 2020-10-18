package com.softserve;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int year = 2020;

        boolean isLeap = false;

        if (year % 4 != 0) {
        } else {
            if (year % 100 != 0) {
                isLeap = true;
            } else {
                if (year % 400 == 0) {
                    isLeap = true;
                } else {
                    isLeap = false;
                }
            }
        }

                System.out.println("Is " + year + " a leap year?\t" + isLeap);
    }
}


