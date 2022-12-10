package com.algorithm.recursion;

import java.util.ArrayList;
import java.util.List;

public class SimpleRecursion {

    public static void main(String[] args) {
        int[] numbers = {1,3,5,7,9,11};

        for (int i =0; i<numbers.length; i++){
            List<Integer> rounds = new ArrayList<>();
            for (int j =i+1; j<numbers.length; j++){
                int cal = numbers[i]+numbers[j];
               rounds.add(cal);
            }
            System.out.println(rounds);
        }
    }
}
