/* Q5. Given a triangle array, return the minimum path sum from top to bottom.For each step, you may move to 
an adjacent number of the row below. More formally, if you are on index i on the current row, you may move 
to either index i or index i + 1 on the next row. */

package Dynamicprogramming1;

public class DP5 {
    public static int solve(int[][] arr){
        int n = arr.length;
        int dp[][] = new int[n+1][n+1];
        for(int j=n-1;j>=0;j--){
            for(int i=j;i>=0;i--){
                dp[j][i]=arr[j][i]+Math.min(dp[j+1][i],dp[j+1][i+1]);
            }
        }
        return dp[0][0];
    }
    public static void main(String args[]){
        int arr[][] ={{2},{3,4},{6,5,7},{4,1,8,3}};
        System.out.println("Minimum path = "+ solve(arr));
        int arr2[][] = {{-10}};
        System.out.println("Minimum paths = "+ solve(arr2));
    }
}
