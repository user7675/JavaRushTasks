package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader readerA = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;
        String a;
        while (! ("сумма".equals(a = readerA.readLine())) ) {
            result += Integer.parseInt(a);
        }
        System.out.println(result);
    }
}
