package com.example.myday1;

import java.util.Arrays;

public class TestDay523 {
    public static void main(String[] args) {
//        countPrime(100);
        int[] arr = {2,-1,-4,-1,1};
//        System.out.println(count(arr));
        System.out.println(getMaxSubArr(arr));
    }

    public static int count(int[] arr){
        int count = 0;
        if (arr == null || arr.length == 0){
            return count;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i-1]){
                count++;
            }
        }
        return arr.length - count;
    }
    /**
     * 埃筛法统计素数个数
     * @param n
     */
    public static void countPrime(int n){
        boolean[] isPrime = new boolean[n];
        int count = 0;
        for (int i = 2; i < 100; i++) {
            if (!isPrime[i]){
                count++;
//                for (int j = i*2; j < n; j = j+i) {
                for (int j = i*i; j < n; j = j+i) {  //优化算法
                    isPrime[j] = true;
                }
            }
        }
        System.out.println(count);
    }

    public static int getMax(int arr[]){
        if (arr == null || arr.length == 0){
            return -1;
        }
        if (arr.length == 1){
            return arr[0];
        }else if (arr.length == 2){
            return Math.max(arr[0], arr[1]);
        }else {
            int[] dp = new int[arr.length];
            dp[0] = arr[0];
            dp[1] = arr[1];
            for (int i = 2; i < arr.length; i++) {
                dp[i] = Math.max(arr[i]+dp[i-2], dp[i-1]);
            }
            return dp[arr.length-1];
        }

    }

    public static int getMaxSubArr(int[] arr){
        if (arr.length == 1){
            return arr[0];
        }else {
            int[] dp = new int[arr.length];
            dp[0] = arr[0];
            for (int i = 1; i < arr.length; i++) {
                dp[i] = Math.max(dp[i-1]+arr[i], arr[i]);
            }
            Arrays.sort(dp);
            return dp[dp.length-1];
        }
    }
}
