/*
Q2. The Tribonacci sequence Tn is defined as follows: 

T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.

Given n, return the value of nth tribonacci number.


Eample 1:

 n = 4

4

Explanation:

T_3 = 0 + 1 + 1 = 2

T_4 = 1 + 1 + 2 = 4
*/



package Dynamicprogramming1;

public class DP2 {
    private static int help(int n){
        int dp[] = new int[n+1];
        dp[0]=0;
        dp[1]=1;
        dp[2]=1;
        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
        }
        return dp[n];
    }
    public static void main(String args[]){
        int n = 25;
        System.out.println(n+"th Tribonacci Number is = "+ help(n));
    }
}
