package com.dev.lib.arrayprogram;

public class FindSecondHighestNumberInArray {

    public static void main(String[] args){
        int[] myIntegerArray = {12,24,30,44,89,5,7};

        System.out.println(findSecondHighest(myIntegerArray));
    }

    private static int findSecondHighest(int[] array) {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int i : array) {
            if (i > highest) {
                secondHighest = highest;
                highest = i;
            } else if (i > secondHighest) {
                secondHighest = i;
            }
        }
        return secondHighest;
    }
}
