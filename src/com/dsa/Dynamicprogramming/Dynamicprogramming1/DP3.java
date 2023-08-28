// Q3. You are a professional robber planning to rob houses along a street. Each house has a certain amount of 
// money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have 
// security systems connected and it will automatically contact the police if two adjacent houses were broken 
// into on the same night.

// Given an integer array nums representing the amount of money of each house, return the maximum 
// amount of money you can rob tonight without alerting the police.


package Dynamicprogramming1;

public class DP3 {
    private static int help(int[] arr){
        int n=arr.length;
        int dp[] = new int[n];
        dp[0]=arr[0];
        if(n==1) return dp[0];
        dp[1]=Math.max(arr[0],arr[1]);
        for(int i=2;i<n;i++){
            dp[i]=Math.max(arr[i]+dp[i-2],dp[i-1]);
        }
        return dp[n-1];
    }
    public static void main(String args[]){
        int arr[] = {2, 7, 9, 3, 1};
        System.out.println("Maximum profit = "+ help(arr));
    }
}
