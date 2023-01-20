package com.dev;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] oddArr = {1,2,3,4,5};
        System.out.println("Before Reverse:"+Arrays.toString(oddArr));
        System.out.println("After Reverse:"+Arrays.toString(reverse(oddArr)));

        System.out.println("--------------------------------");

        int[] evenArr = {1,2,3,4,5,6};
        System.out.println("Before Reverse:"+Arrays.toString(evenArr));
        System.out.println("After Reverse:"+Arrays.toString(reverse(evenArr)));
    }

    public static int[] reverse(int[] arr){
        int len = arr.length;
        int n = len%2 == 0 ? len/2 : len/2+1;
        for (int i=0 ; i<n;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1]= temp;
        }
        return arr;
    }
}
