package com.algorithm.recursion;

public class RecursionL3 {

    // (1) sum of first N numbers
    // * parameter way
    // * functional way
    /*
        example if N =3
        sum is = 6 calculated as 1+2+3 = 6
     */
    public static void main(String[] args) {
       // sumPar(6,0);
       // System.out.println(sumFun(3));
        System.out.println(factorialN(4));
    }

    //parameterized way
    //initial input i=3 sum=0
    public static void sumPar(int i, int sum){

        if (i<1){
            System.out.println(sum);
            return;
        }
        sumPar(i-1,sum+i);
    }

    //functional way
    public static int sumFun(int n){
        if (n==0){
            return 0;
        }
        return n +  sumFun(n-1);
    }

    //Task find factorial of N
    /*
    example#1 if N = 3 --> Factorial = 6
    factorial = 1 X 2 X 3 = 6

    example#2 if N =4 --> Factorial =24
    factorial = 1 X 2 X 3 X 4 = 24
     */

    public static int factorialN(int n){
        if (n==0){
            return 1;
        }
        return n * factorialN(n-1);
    }
}
