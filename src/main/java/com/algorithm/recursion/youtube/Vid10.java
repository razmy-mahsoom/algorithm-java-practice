package com.algorithm.recursion.youtube;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Vid10 {
    /*
    Given a list(Arr) of N integers print sums of all subsets in it, out put should be printed in increasing order

    [3,1,2]  the n =3   subset 2n =8
    [] = sum =0
    [3]  = sum = 3
    [1] = sum = 1
    [2] = sum = 2
    [3,1] = sum = 4
    [3,2] = sum = 5
    [1,2] = sum = 3
    [3,1,2] = sum =6
     */
    public static void main(String[] args) {
        int[]  arr ={3,1,2};
        List<Integer> solution = solution(arr);
        solution.forEach(System.out::println);
    }
    public static void prob01(int i, int[] arr, int sum, List<Integer> prod){
        if(i==arr.length){
            prod.add(sum);
            return;
        }
        prob01(i+1,arr,sum+arr[i],prod);
        prob01(i+1,arr,sum,prod);
    }

    public static List<Integer> solution(int[] arr){
        List<Integer> prod = new ArrayList<>();
        prob01(0,arr,0,prod);
        //prod.sort(Integer::compareTo);
        Collections.sort(prod);
        return prod;
    }
}
