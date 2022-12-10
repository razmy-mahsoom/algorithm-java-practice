package com.algorithm.recursion.youtube;

public class Vid02 {

    //#1 Print name N times using recursion
    //#2 Print linearly 1 to N
    //#3 Print N to 1
    //#4 Print linearly 1 to N (using backtrack)
    //#5 Print N to 1 (using backtrack)

    public static void main(String[] args) {
//        prob1(1,5);
//        prob2(0,5);
//        prob3(5);
//        prob4(5,5);
        prob5(5,5);
    }

    public static void prob1(int count, int n){
        if(count>n){
            return;
        }
        System.out.println("Razmy");
        count++;
        prob1(count,n);
    }

    public static void prob2(int cont, int n){
        if (cont>n){
            return;
        }
        System.out.println(cont);
        cont++;
        prob2(cont,n);
    }

    public static void prob3(int n){
        if(n<1){
            return;
        }
        System.out.println(n);
        prob3(n-1);
    }

    public static void prob4(int count, int n){
        if(count<1){
            return;
        }
        System.out.println(count);
        prob4(count+1,n);
    }

    public static void prob5(int count, int n){
        if(count>n){
            return;
        }
        prob5(count+1,n);
        System.out.println(count);
    }

}
