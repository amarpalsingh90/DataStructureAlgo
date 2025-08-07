package com.dev.lib;

public class RotateTheArrayByKPosition {

    public static void main(String[] args){
        int[] arr= {1,2,3,4,5,6,7};
        int k= 2;
         int size= arr.length;
        rotateArray(arr,0, size-k-1);
        rotateArray(arr,size-k, size-1);
        rotateArray(arr,0, size-1);
        for(int i: arr){
            System.out.print(i+"  ");
        }
    }

    public static void rotateArray(int[] arr, int starIndex, int endIndex){
        while (starIndex<endIndex ){
            int temp = arr[endIndex];
            arr[endIndex]  = arr[starIndex];
            arr[starIndex]= temp;
            starIndex++;
            endIndex--;
        }
    }
}

