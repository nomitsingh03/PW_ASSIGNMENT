// Q5. The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.
// Given an integer n, return the number of distinct solutions to the n-queens puzzle.

package BackTracking;

public class Que5 {
    
    private static int totalQueens(int n){
        int board[][] = new int[n][n];
        return go(0, board);
    }
    private static int go(int col, int[][] board){
        if(col == board.length) return 1;
        int count=0;
        for(int row=0;row<board.length;row++){
            if(isSafe(board, row, col)){
                board[row][col]=1;
                count+=go(col+1, board);
                board[row][col]=0;
            }
        }
        return count;
    }
    private static boolean isSafe(int[][] board, int row, int col){
        int i=row;
        int j=col;
        while(i>=0 && j>=0){
            if(board[i][j]==1) return false;
            i--;
            j--;
        }
        i=row;
        j=col;
        while(j>=0){
            if(board[i][j]==1) return false;
            j--;
        }
        i=row;
        j=col;
        while(j>=0 && i<board.length){
            if(board[i][j]==1) return false;
            j--;
            i++;
        }
        return true;
    }
    public static void main(String[] args){
        int n=4;
        System.out.println("The number of solutions "+totalQueens(n));
    }
}
