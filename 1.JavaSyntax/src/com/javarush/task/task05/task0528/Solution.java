package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
*/

public class Solution {
    public static void main(String[] args) {
        TodayData today = new TodayData(11, 07, 2018);

        System.out.format("%d " + "%02d " +"%d", today.day, today.month, today.year);
    }

    public static class TodayData {
        int day;
        int month;
        int year;

        public TodayData(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }
    }
}
