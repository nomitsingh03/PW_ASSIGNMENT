// Q5.You are given an integer array of coins representing coins of different denominations and an integer 
// amount representing a total amount of money.

// Return the number of combinations that make up that amount. If that amount of money cannot be made up 
// by any combination of the coins, return 0.

// You may assume that you have an infinite number of each kind of coin.

package DynamicProgramming2;

public class DP5 {
    
    private static int coinChange(int amount, int[] coins){
        int size=coins.length;
        int arr[][] = new int[size+1][amount+1];
        for(int i=0;i<size+1;i++) arr[i][0]=1;
        for(int i=1;i<size+1;i++){
            for(int j=0;j<amount+1;j++){
                if(coins[i-1]>j) arr[i][j]=arr[i-1][j];
                else
                    arr[i][j]=arr[i][j-coins[i-1]]+arr[i-1][j];
            }
        }
        return arr[size][amount];
    }
    public static void main(String[] args){
        int[] coins = {1,2,5};
        int amount = 5;
        System.out.println("Output is :"+coinChange(amount, coins));
    }
}
