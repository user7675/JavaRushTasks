package com.javarush.task.task03.task0306;

/* 
Головоломка со скобками
*/
        //System.out.print("num = " + i + " , "); System.out.println(1 + 2 * 3 + 4 * 5 + 6 * 7 + 8 * 9 + 10); i++;

public class Solution {
    public static void main(String[] args) {
        int i = 0;
        int x = 0;
        int b = 0;
        System.out.println("--------------1");


        x = (1 + 2 * ( 3 + 4 * (5 + 6 * 7) + 8 * 9) + 10);
        b = 4 * (5 + 6 * 7);
        System.out.println(x);
        System.out.println(537-x);
        System.out.println(b);
     /*
        System.out.print("num = " + i + " , "); System.out.println((1 + 2 * 3 + 4) * 5 + 6 * 7 + 8 * 9 + 10); i++;
        System.out.print("num = " + i + " , "); System.out.println((1 + 2 * 3 + 4 * 5 + 6) * 7 + 8 * 9 + 10); i++;
        System.out.print("num = " + i + " , "); System.out.println((1 + 2 * 3 + 4 * 5 + 6 * 7 + 8) * 9 + 10); i++;
        System.out.print("num = " + i + " , "); System.out.println(1 + (2 * 3 + 4 * 5 + 6 * 7 + 8 * 9 + 10)); i++;
        System.out.print("num = " + i + " , "); System.out.println(1 + 2 * 3 + 4 * (5 + 6 * 7 + 8 * 9 + 10)); i++;
        System.out.print("num = " + i + " , "); System.out.println(1 + 2 * 3 + 4 * 5 + 6 * (7 + 8 * 9 + 10)); i++;
        System.out.print("num = " + i + " , "); System.out.println(1 + 2 * 3 + 4 * 5 + 6 * 7 + 8 * (9 + 10)); i++; //----------
        System.out.println("--------------2");

        System.out.print("num = " + i + " , "); System.out.println((1 + 2) * 3 + 4 * 5 + 6 * 7 + 8 * 9 + 10); i++;
        System.out.print("num = " + i + " , "); System.out.println((1 + 2) * (3 + 4) * 5 + 6 * 7 + 8 * 9 + 10); i++;
        System.out.print("num = " + i + " , "); System.out.println((1 + 2) * (3 + 4) * 5 + 6 * 7 + 8 * 9 + 10); i++;
        System.out.print("num = " + i + " , "); System.out.println((1 + 2) * (3 + 4) * (5 + 6) * 7 + 8 * 9 + 10); i++;// очень много
        System.out.print("num = " + i + " , "); System.out.println((1 + 2) * (3 + 4) * (5 + 6) * (7 + 8) * 9 + 10); i++; // очень много
        System.out.print("num = " + i + " , "); System.out.println((1 + 2) * (3 + 4) * (5 + 6) * (7 + 8) * (9 + 10)); i++; // очень много----------
        System.out.println("--------------3");

        System.out.print("num = " + i + " , "); System.out.println(1 + 2 * (3 + 4) * 5 + 6 * 7 + 8 * 9 + 10); i++;
        System.out.print("num = " + i + " , "); System.out.println(1 + 2 * 3 + 4 * (5 + 6) * 7 + 8 * 9 + 10); i++;
        System.out.print("num = " + i + " , "); System.out.println(1 + 2 * 3 + 4 * 5 + 6 * (7 + 8) * 9 + 10); i++;
        System.out.println("--------------4");

        System.out.print("num = " + i + " , "); System.out.println((1 + 2) * (3 + 4) * 5 + 6 * 7 + 8 * 9 + 10); i++; //229
        System.out.print("num = " + i + " , "); System.out.println(1 + 2 * (3 + 4) * (5 + 6) * 7 + 8 * 9 + 10); i++; //1161
        System.out.print("num = " + i + " , "); System.out.println((1 + 2) * 3 + 4 * (5 + 6) * 7 + 8 * 9 + 10); i++;
        System.out.print("num = " + i + " , "); System.out.println((1 + 2) * 3 + 4 * 5 + 6 * (7 + 8) * 9 + 10); i++;
        System.out.print("num = " + i + " , "); System.out.println((1 + 2) * 3 + 4 * 5 + 6 * 7 + 8 * (9 + 10)); i++;
        System.out.print("num = " + i + " , "); System.out.println(1 + 2 * (3 + 4) * 5 + 6 * (7 + 8) * 9 + 10); i++;
        System.out.print("num = " + i + " , "); System.out.println(1 + 2 * (3 + 4) * 5 + 6 * 7 + 8 * (9 + 10)); i++;
        System.out.print("num = " + i + " , "); System.out.println(1 + 2 * 3 + 4 * (5 + 6) * (7 + 8) * 9 + 10); i++; //5957
        System.out.print("num = " + i + " , "); System.out.println(1 + 2 * 3 + 4 * (5 + 6) * 7 + 8 * (9 + 10)); i++;


        System.out.println("--------------5");

        System.out.print("num = " + i + " , "); System.out.println((1 + 2) * 3 + 4 * (5 + 6) * 7 + 8 * (9 + 10)); i++; //мало
        System.out.print("num = " + i + " , "); System.out.println((1 + 2) * 3 + 4 * 5 + 6 * 7 + 8 * (9 + 10)); i++; //мало
        System.out.print("num = " + i + " , "); System.out.println((1 + 2) * 3 + 4 * (5 + 6) * 7 + 8 * 9 + 10); i++; // malo
        System.out.print("num = " + i + " , "); System.out.println((1 + 2) * (3 + 4) * 5 + 6 * 7 + 8 * 9 + 10); i++; // malo
        System.out.print("num = " + i + " , "); System.out.println((1 + 2) * 3 + 4 * 5 + 6 * (7 + 8) * 9 + 10); i++; // mnogo
        System.out.print("num = " + i + " , "); System.out.println((1 + 2) * (3 + 4) * 5 + 6 * (7 + 8) * 9 + 10); i++; //много
        System.out.print("num = " + i + " , "); System.out.println(1 + 2 * (3 + 4) * (5 + 6) * 7 + 8 * 9 + 10); i++; // mnogo
        System.out.print("num = " + i + " , "); System.out.println((1 + 2) * 3 + 4 * (5 + 6) * (7 + 8) * 9 + 10); i++; //много
        System.out.println("--------------6");

*/
    }
}
/*
    List<Var> varList = new ArrayList<>();

    public static void main(String[] args) {
//        System.out.println(1 + 2 * 3 + 4 * 5 + 6 * 7 + 8 * 9 + 10); //537
        Solution solution = new Solution();

        String str = " 1 + 2 * 3 + 4 * 5 + 6 * 7 + 8 * 9 + 10 ";
        char[] arr = solution.strToChar(str);
        solution.solve(arr);

    }

    public char[] strToChar(String s) {
        return s.toCharArray();
    }

    public char[] insertBracket(Var var, char[] arr) {
        char[] temp_arr = arr;
        temp_arr[var.opened] = '(';
        temp_arr[var.closed] = ')';
        return temp_arr;
    }

    public char[] findInsideBracket(char[] arr) {
        char[] temp_arr = arr;

        for (int i = 0; i < temp_arr.length; i++) {

            if (temp_arr[i] == '(') {
                temp_arr[i] = ' ';
                temp_arr = Arrays.copyOfRange(temp_arr, 0, temp_arr.length);
            }
            if (temp_arr[i] == ')') {
                temp_arr= Arrays.copyOfRange(temp_arr, 0, i);
            }
        }

        return temp_arr;
    }

    public char solveArray(char[] arr) {
        char[] temp_arr = arr;
        char result = 0;

        if (temp_arr[3] == '*') {
            result = multiply(temp_arr);
        }
        if (arr[3] == '+') {
            result = plus(temp_arr);
        }

        return result;
    }

    public char[] writeResult(char[] arr, int value) {
        char[] temp_arr = arr;
        temp_arr[1] = (char) value;

        for (int i = 0; i < temp_arr.length; i++) {
            if ((temp_arr[i] == '(') || ( temp_arr[i] == ')')) temp_arr[i] = ' ';
        }

        for (int i = 3; i < temp_arr.length-4; i++) {
            temp_arr[i] = temp_arr[i+4];
        }
        return temp_arr;
    }

    public char multiply(char[] arr) {
        int result = Character.getNumericValue(arr[0]) * Character.getNumericValue(arr[0 + 4]);
        result += 48;
        return (char) result;
    }

    public char plus(char[] arr) {
        int result = Character.getNumericValue(arr[1]) + Character.getNumericValue(arr[1 + 4]);
        result += 48;
        return (char) result;
    }

    public void variant() {
        varList.add(new Var(0, 6));
    }

    class Var {
        int opened;
        int closed;

        public Var(int opened, int closed) {
            this.opened = opened;
            this.closed = closed;
        }
    }

    public void solve(char[] strChar) {
        char[] answer = strChar;

        variant();
        for(Var var: varList) {
            answer =  writeResult(strChar, solveArray(findInsideBracket(insertBracket(var, strChar))));

            while (answer.length >1) {
                answer = writeResult(answer, solveArray(answer));
            }
        }

            System.out.println(answer);
    }
}
*/
