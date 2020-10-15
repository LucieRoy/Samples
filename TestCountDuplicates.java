package com.company;

import java.util.HashMap;

    public class TestCountDuplicates {

    /* Take an array of integers with duplicates
     Count the count of occurrence for each integer
     Prints each integer with its frequency of occurrence
     Expected outpu example: with input: int[] nums = {65,4,90,4,65,7,65,8,90,7,7};
     65 3
     4 2
     7 3
     8 1
     90 2
    */
        public static int countDuplicates(int[] nums) {
            int len = nums.length;

            // if array is empty
            if ((len == 0)) {
                return len;
            }

            HashMap<Integer, Integer> numbersFrequency = new HashMap<Integer, Integer>();

            for (int i = 0; i < nums.length; i++) {
                int item = nums[i];
                if (numbersFrequency.containsKey(item))
                    numbersFrequency.put(item, numbersFrequency.get(item) + 1);
                else
                    numbersFrequency .put(item, 1);
            }

            // In Java 8, print the integers and its related frequency count
            numbersFrequency.entrySet().forEach(entry->{
                System.out.println(entry.getKey() + " " + entry.getValue());
            });

            return len;
        }
    }


