package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(2, 0.8));
        System.out.println(convertEurToUsd(55, 0.76));
    }

    public static double convertEurToUsd(int eur, double course) {
        return eur * course;
    }
}
