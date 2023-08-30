// Q1. Given an integer array arr and an integer k, return true if it is 
// possible to divide the vector into k non-empty subsets with equal sum.

package BackTracking;

import java.util.Arrays;

public class Que1 {
    
    private static boolean solve(int[] arr, int take[], int idx, int curr_sum, int target, int k){
        if(k==1) return true;
        if(curr_sum>target) return false;
        if(curr_sum==target) return solve(arr, take, 0, 0, target, k-1);
        for(int i=idx;i<arr.length;i++){
            if(take[i]==-1){
                take[i]=1;
                if(solve(arr, take, i+1, curr_sum+arr[i],target, k)) return true;
                take[i]=-1;
            }
        }
        return false;
    }

    private static boolean canPartition(int[] arr, int k){
        int n =  arr.length;
        int take[] = new int[n];
        Arrays.fill(take, -1);
        int sum = Arrays.stream(arr).sum();
        // System.out.println(sum);
        if(sum%k!=0) return false;
        return solve(arr, take, 0, 0 ,sum/k, k);

    }
    public static void main(String[] args){
        int arr[] = {1,2,2,3};
        int k=2;
        if(canPartition(arr, k)){
            System.out.println("Yes it is possible to partion the array");
        } else {
            System.out.println("NO, it is not possible. ");
        }
    }
}
