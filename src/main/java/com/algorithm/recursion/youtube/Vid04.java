package com.algorithm.recursion.youtube;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Vid04 {

    //#01 Reverse an array
    //#02 Check if a given String is palindrome (palindrome --> a string on reversal read the same eg (wow,MADAM,11211)

    public static void main(String[] args) {
        /* PROBLEM -01
        int[] v = {1,2,3,5,6,9,10};
        int[] prob = prob(0, v);

        for (int i = 0; i<prob.length; i++){
            System.out.println(prob[i]);
        }
         */

        String madam ="11211";
        char[] arr = madam.toCharArray();
        boolean b = prob02(0, arr);
        System.out.println(b);
    }

    public static int[] prob(int i,int[] arr){

        if(i>=arr.length/2){
            return arr ;
        }
        swap(i,arr.length-i-1,arr);
        return prob(i+1,arr);

    }
    public static void swap(int i, int r,int[] arr){
        int temp = arr[i];
        arr[i] = arr[r];
        arr[r]=temp;
    }

    public static boolean prob02(int i,char[] arr){
        int size = arr.length;
        if(i>=size/2){
            return true;
        }
        if(arr[i]!=arr[size-i-1]){
            return false;
        }
        return prob02(i+1,arr);
    }
}
