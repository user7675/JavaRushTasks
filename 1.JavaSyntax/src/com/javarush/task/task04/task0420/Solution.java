package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;


public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        System.out.print( findMax(a,b,c) + " ");
        System.out.print( findMid(a,b,c) + " ");
        System.out.print( findMin(a,b,c) );
    }

    public static int findMax(int a, int b, int c ) {
        if (a >= b && a >= c)
            return a;
        if (b >= a && b >= c)
            return b;
        else
            return c;
    }

    public static int findMid(int a, int b, int c ) {
        if ( (a >= b && a <= c) || (a <= b && a >= c) )
            return a;
        if ( (b >= a && b <= c) || (b <= a && b >= c) )
            return b;
        else
            return c;
    }

    public static int findMin(int a, int b, int c ) {
        if (a <= b && a <= c)
            return a;
        if (b <= a && b <= c)
            return b;
        else
            return c;
    }


}


