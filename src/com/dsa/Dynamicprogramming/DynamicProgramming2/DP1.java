/* Q1. You are given an m x n integer array grid. There is a robot initially located at the top-left corner (i.e., 
grid[0][0]). The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only 
move either down or right at any point in time.

An obstacle and space are marked as 1 or 0 respectively in the grid. A path that the robot takes cannot 
include any square that is an obstacle.

Return the number of possible unique paths that the robot can take to reach the bottom-right corner */

package DynamicProgramming2;

public class DP1 {
 
    private static int solve(int[][] grid){
        int n = grid.length;
        int m = grid[0].length;
        int dp[] = new int[n];
        dp[0]=1;
        for(int[] rows: grid){
            for(int j=0;j<m;j++){
                if(rows[j]==1) dp[j]=0;
                else if(j>0){
                    dp[j]+=dp[j-1];
                }
            }
        }
        return dp[n-1];
    }
    public static void main(String args[]){
        int obstaclesGrid[][] = {{0,0,0},{0,1,0},{0,0,0}};
        System.out.println("Number of possible paths = "+solve(obstaclesGrid));
        int obstaclesGrid2[][] = {{0,1},{0,0}};
        System.out.println("Number of possible paths = "+solve(obstaclesGrid2));
    }   
}
