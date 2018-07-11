package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(reader.readLine());
        int finish_year = 0;
        if (year % 4 == 0) {
            finish_year = 366;
            if (year % 100 == 0) {
                finish_year = 365;
            }
            if (year % 400 == 0) {
                finish_year = 366;
            }
        } else {
            finish_year = 365;
        }
        System.out.println("количество дней в году: " + finish_year);
    }


}