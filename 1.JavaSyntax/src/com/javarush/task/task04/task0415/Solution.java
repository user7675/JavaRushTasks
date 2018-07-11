package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader readerA = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(readerA.readLine());

        BufferedReader readerB = new BufferedReader(new InputStreamReader(System.in));
        int b = Integer.parseInt(readerB.readLine());

        BufferedReader readerC = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(readerC.readLine());

        if ( ((a+b)>c) && ((b+c)>a) && ((c+a)>b) ) {

            System.out.println("Треугольник существует.");
        }
        else {
            System.out.println("Треугольник не существует.");
        }
    }
}