package com.algorithm.recursion.youtube;

public class Vid03 {

    //#01 Summarization of N (if N =3 solution --> 1+2+3 =6 <= Parameterised Way
    //#02 Summarization of N (if N =3 solution --> 1+2+3 =6 <= Functional Way
    //#3 Factorial of N (if N =3 solution --> 1X2X3 =6  <=Parameterised Way
    //#4 Factorial of N (if N =3 solution --> 1X2X3 =6  <=Functional Way


    public static void main(String[] args) {
        //prob01(10,0);
        //System.out.println(prob02(10));
        //prob03(3,1);
        System.out.println(prob04(4));
    }

    public static void prob01(int n, int sum){
        if(n<1){
            System.out.println(sum);
            return;
        }
        prob01(n-1,sum+n);
    }

    public static int prob02(int n){
        if(n==0){
            return 0;
        }
        return n+prob02(n-1);
    }

    public static void prob03(int n, int sum){
        if(n<1){
            System.out.println(sum);
            return;
        }
        prob03(n-1,sum*n);
    }

    public static int prob04(int n){
        if(n==1){
            return 1;
        }
        return n * prob04(n-1);
    }
}
