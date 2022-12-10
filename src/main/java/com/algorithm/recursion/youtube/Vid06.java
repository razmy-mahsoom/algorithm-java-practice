package com.algorithm.recursion.youtube;

import java.util.ArrayList;
import java.util.List;

public class Vid06 {

    //Print all subsequences
    public static void main(String[] args) {
        int[] vec ={3,1,2};
        List<Integer> rm = new ArrayList<>();
        prob01(0,vec,rm);
    }

    public static void prob01(int i, int[] arr, List<Integer> prod){
        if(i>=arr.length){
            System.out.println(prod);
            return;
        }
        prod.add(arr[i]);
        prob01(i+1,arr,prod);
        prod.remove(arr[i]);
        prob01(i+1,arr,prod);
    }
}
