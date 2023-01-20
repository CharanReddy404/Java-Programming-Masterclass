package com.dev;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = getRandomArray(5);
        System.out.println("unSorted Array "+Arrays.toString(arr));
        System.out.println(Arrays.toString(desArray(arr)));
    }

    public static int[] getRandomArray(int len){
        Random random = new Random();
        int[] randomArray = new int[len];
        for (int i=0;i<len;i++){
            randomArray[i]=random.nextInt(100);
        }
        return randomArray;
    }
    private static int[] desArray(int[] arr){

        System.out.println(Arrays.toString(arr));
        int[] newArr = Arrays.copyOf(arr,arr.length);
        boolean flag = true;
        while (flag){
            flag = false;
            for (int i=0; i<newArr.length-1;i++){
                if(newArr[i]<newArr[i+1]){
                    int temp = newArr[i];
                    newArr[i]= newArr[i+1];
                    newArr[i+1]= temp;
                    flag=true;
                }
            }
            System.out.println("----->"+Arrays.toString(newArr));
        }

//        int[] newArr = new int[arr.length];
//        int[] tempArr = Arrays.copyOf(arr,arr.length);
//        Arrays.sort(tempArr);
//        System.out.println("Sorted Array "+Arrays.toString(tempArr));
//        int index = 0;
//        for(int i= arr.length-1;i>=0;i--){
//            newArr[i]= tempArr [index++];
//        }
        return newArr;
    }
}
