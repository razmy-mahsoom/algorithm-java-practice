package com.algorithm.recursion.youtube;

import java.util.*;
import java.util.stream.Collectors;

public class Vid09 {
    /*

    Combination sum
    given an array [10,1,2,7,6,5] and the K = 8
    find the unique combination where the candidates sum up to the K
    each number in candidates can be used only once
     */

    public static void main(String[] args) {
        int[] arr = {10,1,2,7,6,5};
        int[] arr2 ={1,1,1,2,2};
        int target =4;
        List<List<Integer>> solution = solution(arr2, target);
        solution.forEach(System.out::println);
    }

    public static void prob01(int i, int[] arr, int target, Set<List<Integer>> ans, List<Integer> ds){
        if(i==arr.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
            ds.add(arr[i]);
            prob01(i+1,arr,target-arr[i],ans,ds);
            ds.remove(ds.size()-1);
            prob01(i+1,arr,target,ans,ds);

    }

    public static List<List<Integer>> solution(int[] arr, int target){
        Set<List<Integer>> ans = new HashSet<>();
        prob01(0,arr,target,ans,new ArrayList<>());
        List<List<Integer>> ans2 = new ArrayList<>(ans);
        return ans2;
    }
}
