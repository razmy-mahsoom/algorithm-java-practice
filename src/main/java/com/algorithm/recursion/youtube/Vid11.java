package com.algorithm.recursion.youtube;

import java.util.*;

public class Vid11 {
    /*
    #01
    Given an Integer array nums that may contain duplicates, return all the possible subsets (power set), The solution set
    must not contain duplicates subsets, Return the solution in any order
    ex
    Given => [1,2,2]
    output=> [],[1],[1,2],[1,2,2],[2],[2,2]

    #02 -> optimize the solution (without using Set)
     */
    public static void main(String[] args) {
        int[]  arr = {1,2,2};
        /* Problem -01
        List<List<Integer>> solution = getSolution01(arr);
        solution.forEach(System.out::println);
        */

        List<List<Integer>> solution02 = getSolution02(arr);
        solution02.forEach(System.out::println);
    }

    public static void prob01(int i, int[] arr, Set<List<Integer>> prod, ArrayList<Integer> ds){
        if(i==arr.length){
            prod.add(new ArrayList<>(ds));
            return;
        }
        ds.add(arr[i]);
        prob01(i+1,arr,prod,ds);
        ds.remove(ds.size()-1);
        prob01(i+1,arr,prod,ds);
    }

    public static List<List<Integer>> getSolution01(int[] arr){
        Set<List<Integer>> prod = new HashSet<>();
        prob01(0,arr,prod,new ArrayList<>());
        List<List<Integer>> prod1 = new ArrayList<>(prod);
        return prod1;
    }

    public static void prob02(int ind, int[] arr, ArrayList<Integer> ds, List<List<Integer>> ans){
        ans.add(new ArrayList<>(ds));

        for(int i = ind; i<arr.length; i++){
            if(i!=ind && arr[i]==arr[i-1]) continue;
            ds.add(arr[i]);
            prob02(i+1,arr,ds,ans);
            ds.remove(ds.size()-1);
        }
    }

    public static List<List<Integer>> getSolution02(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        prob02(0,arr,new ArrayList<>(),ans);
        return ans;
    }
}
