package com.algorithm.recursion.youtube;

import java.util.ArrayList;
import java.util.List;

public class Vid08 {

    /*
    Combination sum
    given an array [2,3,6,7] and the K = 7
    solution [2,2,3] and [7]  {if same candidate can be used multiple times)
     */

    public static void main(String[] args) {

        int[]  arr = {2,3,6,7};
        List<List<Integer>> solutions = getSolutions(arr, 7);
        solutions.forEach(System.out::println);
    }

    public static void prob01(int ind, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds){
        if(ind == arr.length){
            if (target==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if (arr[ind]<=target){
            ds.add(arr[ind]);
            prob01(ind,arr,target-arr[ind],ans,ds);
            ds.remove(ds.size()-1);
        }
        prob01(ind+1,arr,target,ans,ds);
    }

    public static List<List<Integer>> getSolutions(int[] arr, int target){
        List<List<Integer>> ans = new ArrayList<>();
        prob01(0,arr,target,ans,new ArrayList<>());
        return ans;
    }
}
