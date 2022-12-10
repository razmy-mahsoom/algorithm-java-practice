package com.algorithm.recursion.youtube;

import java.util.ArrayList;

public class Vid07 {

    //#01 Print all subsequences whose sum is K
    //#02 Print any one subsequence whose sum is K
    //#03 Count subsequence whose sum is K

    public static void main(String[] args) {
        int[] arr ={1,2,1};
        int k = 2;
        ArrayList<Integer> pro = new ArrayList<>();
      //  prob01(0,arr,0,pro,k ); //PROBLEM 01
      //  prob02(0,arr,0,pro,k ); //PROBLEM 02

        int i = prob03(0, arr, 0,  k);
        System.out.println(i);
    }
    public static void prob01(int i, int[] arr, int sum, ArrayList<Integer> prod, int k){

        if(i==arr.length){
            if(sum==k){
                System.out.println(prod);
            }
            return;
        }
        prod.add(arr[i]);
        prob01(i+1,arr,sum+arr[i],prod,k);
        prod.remove(prod.size()-1);
        prob01(i+1,arr,sum-arr[i],prod,k);
    }

    public static boolean prob02(int i, int[] arr, int sum,ArrayList<Integer> prod,int k){
        if(i==arr.length){
            if(k==sum){
                System.out.println(prod);
                return true;
            }
            return false;
        }
        prod.add(arr[i]);
        if(prob02(i+1,arr,sum+arr[i],prod,k)==true){return true;}
        prod.remove(prod.size()-1);
        if(prob02(i+1,arr,sum-arr[i],prod,k)==true){return true;}
        return false;
    }

    public static int prob03(int i, int[] arr, int sum,int k){
        if(i==arr.length){
            if(k==sum){
                return 1;
            }
            return 0;
        }

        int i1 = prob03(i + 1, arr, sum + arr[i],  k);

        int i2 = prob03(i + 1, arr, sum - arr[i],  k);

        return i1+i2;
    }
}
