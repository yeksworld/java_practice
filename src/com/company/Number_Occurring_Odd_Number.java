package com.company;

import java.security.KeyStore;
import java.util.HashMap;
import java.util.Map;

public class Number_Occurring_Odd_Number {
    //Find the number occurring odd number of times in an array

    int getOddTimesElementHashing(int[] ar)
    {
        int i;

        HashMap<Integer,Integer> elements=new HashMap<Integer,Integer>();
        for (i = 0; i < ar.length; i++)
        {
            int element=ar[i];
            elements.merge(element, 1, Integer::sum);
        }
        for (Map.Entry<Integer, Integer> entry:elements.entrySet()) {
            if(entry.getValue()%2==1)
            {
                return entry.getKey();
            }

        }
        return -1;
    }
}
