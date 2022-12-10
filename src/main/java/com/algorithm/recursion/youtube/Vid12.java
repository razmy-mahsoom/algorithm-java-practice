package com.algorithm.recursion.youtube;

import java.util.ArrayList;
import java.util.List;

public class Vid12 {
    /*
    Given an array nums of distict integers, return all the possible permutation, you can return the answer in any order
    ex=>

    Given => nums =[1,2,3]
    Output => [ [1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1] ]

    Given => nums =[0,1]
    Output => [ [0,1],[1,0] ]
     */
    public static void main(String[] args) {
        int[] arr ={0,1};
        List<List<Integer>> solution = getSolution(arr);
        solution.forEach(System.out::println);
    }
    public static void prob01(int[] arr, List<Integer> ds, List<List<Integer>> ans, boolean[] freq){
        if(ds.size()==arr.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0; i<arr.length;i++){
            if(!freq[i]){
                freq[i] = true;
                ds.add(arr[i]);
                prob01(arr,ds,ans,freq);
                ds.remove(ds.size()-1);
                freq[i]=false;
            }
        }
    }

    public static List<List<Integer>> getSolution(int[] arr){
        List<List<Integer>> ans = new ArrayList<>();
        boolean frq[] = new boolean[arr.length];
        prob01(arr,new ArrayList<>(),ans,frq);
        return ans;
    }
}
