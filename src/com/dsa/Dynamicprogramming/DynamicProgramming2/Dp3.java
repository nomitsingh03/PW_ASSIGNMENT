/* Q3. Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right, which 
minimizes the sum of all numbers along its path.
Note: You can only move either down or right at any point in time. */

package DynamicProgramming2;

public class Dp3 {
    private static int helper(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;
        int dp[][] = new int[m][n];
        dp[0][0]=grid[0][0];
        for(int i=1;i<n;i++){
            dp[0][i]= grid[0][i]+dp[0][i-1];
        }
        for(int j=1;j<m;j++) dp[j][0]=grid[j][0]+dp[j-1][0];
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j]=grid[i][j] + Math.min(dp[i-1][j], dp[j-1][i]);
            }
        }
        return dp[m-1][n-1];
    }
    public static void main(String args[]){
        int grid[][] = {
            {1,3,1},
            {1,5,1},
            {4,2,1}
        };
        
        System.out.println("Minimum path sum = "+ helper(grid));
        int grid2[][] = {
            {1,2,3},
            {4,5,6}
        };
        System.out.println("Minimum path sum = "+ helper(grid2));
    }
}
