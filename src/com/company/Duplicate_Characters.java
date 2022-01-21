package com.company;
import java.util.HashMap;
import java.util.Scanner;

public class Duplicate_Characters {

        public static void main(String[] args) {
            System.out.println("Please enter sentences");
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);

                if (charCountMap.containsKey(c)) {
                    charCountMap.put(c, charCountMap.get(c) + 1);
                } else {
                    charCountMap.put(c, 1);
                }

            }
            for (Character c : charCountMap.keySet()) {
                if (charCountMap.get(c) > 1)
                    System.out.println("duplicate character : " + c + " ====== " + " count : " + charCountMap.get(c));
                    System.out.println(charCountMap);

            }

        }

    }
