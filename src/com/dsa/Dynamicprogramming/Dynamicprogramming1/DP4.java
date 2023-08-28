/* 
Q4. There is a robot on an m x n grid. The robot is initially located at the top-left corner (i.e., grid[0][0]). The 
robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only move either down 
or right at any point in time.

Given the two integers m and n, return the number of possible unique paths that the robot can take to reach 
the bottom-right corner. */

package Dynamicprogramming1;

import java.util.*;

public class DP4 {

    // Recursion
    private static int solve(int i, int j){
        if(i==0 || j==0) return 1;
        if(i<0 || j<0) return 0;
        int up = solve(i-1,j);
        int left=solve(i,j-1);
        return up+left;
    }

    // Top-Down Approach
    private static int solve2(int i, int j, int[][] dp){
        if(i==0||j==0) dp[i][j]=1;
        if(i<0||j<0) dp[i][j]=0;
        if(dp[i][j]!=-1) return dp[i][j];
        dp[i][j] = solve2(i-1,j,dp)+solve2(i,j-1,dp);
        return dp[i][j];
    }


    // Bottom-up Approach(Tabulation)
    private static int solve3(int m, int n){
        int dp[][] = new int[m][n];
        for(int i=0;i<m;i++) dp[i][0]=1;
        for(int j=0;j<n;j++) dp[0][j]=1;
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }    

    // Bottom-up Approach -2
    private static int solve4(int m, int n){
        int[] prev = new int[n];
        for(int i=0;i<m;i++){
            int[] curr= new int[n];
            for(int j=0;j<n;j++){
                if(i==0 && j==0) curr[j]=1;
                else {
                    int up=0;
                    int left=0;
                    if(i>0) up=prev[j];
                    if(j>0) left=curr[j-1];
                    curr[j]=up+left;
                }
            }
            prev=curr;
        }
        return prev[n-1];
    }    

    public static void main(String args[]){
        int m=3;
        int n=7;
        int dp[][] = new int[m][n];
        for(int[] rows: dp) Arrays.fill(rows, -1);
        System.out.println(solve(m-1, n-1));
        System.out.println(solve2(m-1, n-1, dp));
        System.out.println(solve3(m, n));
        System.out.println(solve4(m, n));
    }
}
