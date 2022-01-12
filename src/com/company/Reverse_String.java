package com.company;

import java.util.Scanner;

public class Reverse_String {

    //How to reverse a String in java? Can you write a program without using any java inbuilt methods?

        public static void main(String[] args) {
            System.out.println("Please enter String that you want to reverse");
            Scanner scan = new Scanner(System.in);
            String blogName = scan.nextLine();
            StringBuilder reverse = new StringBuilder();
            for (int i = blogName.length() - 1; i >= 0; i--) {
                reverse.append(blogName.charAt(i));
            }
            System.out.println("Reverse of java2blog is: " + reverse);
        }
    }


