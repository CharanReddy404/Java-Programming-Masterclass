package com.dev;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the length of Array: ");
//        int len = sc.nextInt();
//        int[] Array = readIntegersInt(len);
        int[] Array = readIntegers();
        System.out.println("Array->"+ Arrays.toString(Array));
        System.out.println("The Min Value in Array is "+findMin(Array));
    }

    public static int findMin(int[] arr){
        int temp = Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
            if(arr[i]<temp){
                temp = arr[i];
            }
        }
        return temp;
    }

    public static int[] readIntegers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a list of integers, separated by commas:");
        String input  = sc.nextLine();
        String[] splits = input.split(",");
        int[] values = new int[splits.length];
        for (int i=0;i<splits.length;i++){
            values[i]= Integer.parseInt(splits[i]);
        }
        return values;
    }
    public static int[] readIntegersInt(int len){
        int arr[] = new int[len];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<len;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}
