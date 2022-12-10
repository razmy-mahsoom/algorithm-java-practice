package com.algorithm.recursion.youtube;

import java.util.ArrayList;
import java.util.List;

public class Vid07 {

    // Print subsequences whose sum is K

    public static void main(String[] args) {
        int[] arr ={1,2,1};
        int k = 2;
        ArrayList<Integer> pro = new ArrayList<>();
        prob01(0,arr,0,pro,k );

    }
    public static void prob01(int i, int[] arr, int sum, ArrayList<Integer> prod, int k){

        if(i==arr.length){
            if(sum==k){
                System.out.println(prod);
            }
            return;
        }
        prod.add(arr[i]);
        prob01(i+1,arr,sum+arr[i],prod,k);
        prod.remove(prod.size()-1);
        prob01(i+1,arr,sum-arr[i],prod,k);
    }
}
