package com.algorithm.recursion;

public class RecursionL2 {

    public static void main(String[] args) {
        printNto1Backtracking(1,5);
    }

    //Print Name 5 times using recursion
    public static void printName(int i, int count){

        if (i==count){
            return;
        }
        System.out.println("Razmy");
        printName(i+1,count);
    }

    //Print learner  from 1 to N
    public static void print1ToN(int i, int n){
        if (i>n){
            return;
        }
        System.out.println(i);
        print1ToN(i+1,n);
    }

    //Print N to 1
    public static void printNto1(int n){
        if (n<1){
            return;
        }
        System.out.println(n);
        printNto1(n-1);

    }

    //print linearly from 1 to N using backtracking
    //without using i+1
    public static void print1toNBackTrack(int i, int n){

        if (i<1){
            return;
        }
        print1toNBackTrack(i-1,n);
        System.out.println(i);

    }

    //print linearly from N to 1 using backtracking
    //without using i-1
    public static void printNto1Backtracking(int i, int n){
        if(i>n){
            return;
        }
        printNto1Backtracking(i+1,n);
        System.out.println(i);

    }
}
