// Q4. Check if the product of some subset of an array is equal to the target value.

package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;

public class Que4 {
    
    private static boolean solve(int[] arr, int n, int target, int idx, int p, int[] take){
        if(idx==n) {
            if(p==target) {
                for(int i=0;i<n;i++){
            if(take[i]!=0) System.out.print(arr[i]+" ");
        }
                return true;}
            else return false;
        }
        boolean answer=false;
        take[idx]=1;
        p*=arr[idx];
        answer |= solve(arr, n, target, idx+1, p, take);
        take[idx]=0;
        p/=arr[idx];
        answer |= solve(arr, n, target, idx+1, p, take);
        return answer;
    }
    public static void main(String args[]){
        int arr[] = {2, 3, 2, 5, 4};
        int n=arr.length;
        int p=1;
        int target=16;
        int take[]=new int[n];
        if(solve(arr, n, target, 0, p, take))
        System.out.println("Yes");
        else 
            System.out.println("Not possible");
    }
}


