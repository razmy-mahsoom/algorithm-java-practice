package com.algorithm.tests;

import java.net.Socket;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        //System.out.println(factorial(10));
        System.out.println(100%3);



    }

    //change variable values
    public static List<Integer> changeValue(int a, int b){
        a = a + b;
        b = a - b;
        a = a - b;

        List<Integer> nums = new ArrayList<>();
        nums.add(a);
        nums.add(b);
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        return new ArrayList<Integer>();
    }

    //swap variable values
    public static void swapValue(int a, int b){
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }

    //reverse a list (java)
    public static List<Integer> reverseList(List<Integer> numbers){
        List<Integer> numbers1 = numbers;
        Collections.reverse(numbers1);
        return numbers1;
    }

    //reverse a list recursion method
    public static void reverseRecursion(List<Integer> numbers){
        if(numbers.size()<=1 || numbers ==null){
            return ;
        }
        Integer remove = numbers.remove(0);
        reverseRecursion(numbers);
        numbers.add(remove);

    }

    //reverse a string
    public static String reverseString(String text){
        StringBuilder builder = new StringBuilder(text);
        return builder.reverse().toString();
    }

    //factorial recursion
    public static long factorial(int n){
        if(n<=1){
            return 1;
        }
        return n*factorial(n-1);
    }




}
