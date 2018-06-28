package com.javarush.task.task03.task0306;

/* 
Головоломка со скобками
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(1 + (2 * 3) + 4 * 5 + 6 * 7 + (8 * 9) + 10);
    }
}


public class Temp {
    Var var1;

    public static void main(String[] args) {
        System.out.println(1 + 2 * 3 + 4 * 5 + 6 * 7 + 8 * 9 + 10); //537
        Solution solution = new Solution();
        solution.recursion("1 + 2 * 3 + 4 * 5 + 6 * 7 + 8 * 9 + 10", 0);

        String str = " 1 + 2 * 3 + 4 * 5 + 6 * 7 + 8 * 9 + 10 ";
        Temp temp = new Temp();
        char[] arr = temp.strToChar(str);
    }

    public char[] strToChar(String s) {
        return s.toCharArray();
    }


    public char[] insertBracket(char[] arr) {
        char[] temp = arr;
        temp[var1.opened] = '(';
        temp[var1.closed] = ')';
        return temp;
    }

    public char[] findInsideBracket(char[] arr){
        char[] temp_arr;

        for (int i = 0; i<26; i++) {
            if( arr[i] == '(') temp_arr[i] = arr[i+1];
            if( arr[i] == ')') {
                temp_arr[i] = NULL;
                solveInsideBracket(temp_arr);
            }
        }
        return temp_arr
    }

    public char[] solveInsideBracket(char[] arr){
        char[] temp_arr_plus;
        char[] temp_arr_multiply;

        for (int i = 0; i<26; i++) {
            if (arr[i+2] ==
        }



    }

        public void variant(String args) {
        var1 = new Var(0, 6);
    }

    public class Var {
        int opened;
        int closed;

        public Var(int opened, int closed) {
            this.opened = opened;
            this.closed = closed;
        }
    }

    public int solve(char[] strChar) {
        int answer;
        insertBracket(strChar);
        answer = strChar;
        return answer;
    }
}