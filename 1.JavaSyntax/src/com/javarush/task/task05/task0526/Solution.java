package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Woman wom = new Woman("Wom", 23, "asd 123");
        Woman fuf = new Woman("Fuf", 23, "asd 124");
        Man man = new Man("Man", 23, "asd 121");
        Man ken = new Man("Ken", 23, "asd 122");

        System.out.println(wom.name + " " + wom.age + " " + wom.address);
        System.out.println(fuf.name + " " + fuf.age + " " + fuf.address);
        System.out.println(man.name + " " + man.age + " " + man.address);
        System.out.println(ken.name + " " + ken.age + " " + ken.address);

    }

   public static class Woman {
       String name;
       int age;
       String address;

       public Woman(String name, int age, String address) {
           this.name = name;
           this.age = age;
           this.address = address;
       }
   }

    public static class Man {
       String name;
       int age;
       String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}
