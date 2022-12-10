package com.algorithm.recursion.youtube;

public class Vid05 {
    //Multiple recursion calls
    //Fibonacci number (0,1,1,2,3,5,8,13,21,34,.....n) (n = n-1+ n-2)

    //#01 find the Nth fibonacci number

    public static void main(String[] args) {
        System.out.println(prob01(4));
    }

    public static int prob01(int n){
        if(n<=1){
            return n;
        }
        return prob01(n-1)+prob01(n-2);
    }
}
