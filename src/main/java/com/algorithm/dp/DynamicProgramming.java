package com.algorithm.dp;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class DynamicProgramming {

    //find the fevonacci number
    public static void main(String[] args) {

        int[] mix = {3,9,11,8,4,12,16,19,22,144};
        int target = 144+9;
        int[] result = new int[2];


        for (int i=0; i<mix.length; i++){

            int temp = target-mix[i];
            for(int k =0; k<mix.length; k++){
                if(temp==mix[k]){
                    result[0]=i;
                    result[1]=k;
                }
            }
        }
        Arrays.stream(result).forEach(System.out::println);




    }

}



