package com.company;

public class Main {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 333; i++) {
            int a = 3 * i + 1;
            sum += a;
        }
        System.out.println(sum);
        System.out.println("----------------------------");
        add();
    }

    public static void add() {
        int sum = 0;
        for (int i = 0; i <= 1000; i++) {
            sum = i%3==1 ? sum+i:sum;r

          /*  if (i % 3 == 1) {
                sum = sum + i;
            }*/
        }
        System.out.println("sum = " + sum);
    }
}