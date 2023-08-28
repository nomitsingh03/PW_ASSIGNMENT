/* Q4. Given an integer array nums, return true if you can partition the array into two subsets such that the sum 
of the elements in both subsets is equal or false otherwise. */

package DynamicProgramming2;

public class DP4 {

    private static boolean solve3(int nums[], int k, int i){
        if(k==0) return true;
        if(i==0 ) return nums[0]==k;
        boolean nottake = solve3(nums, k, i-1);
        boolean take=false;
        if(nums[i]<=k)
        take = solve3(nums, k-nums[i], i-1);
        return take||nottake;
    }
    private static boolean solve2(int[]nums, int k){
        int n=nums.length;
        boolean dp[][] = new boolean[n+1][k+1];
        for(int i=0;i<n;i++) dp[i][0]=true;
        dp[0][nums[0]]=true;
        for(int i=1;i<n;i++){
            for(int target=1;target<=k;target++){
                boolean nottake = dp[i-1][target];
                boolean take = false;
                if(nums[i]<=target ) take = dp[i-1][target-nums[i]];
                dp[i][target]=take||nottake;
            }
        }
        return dp[n-1][k];
    }
    private static boolean solve(int[] nums, int k){
        int n=nums.length;
        boolean curr[] = new boolean[k+1];
        boolean prev[] = new boolean[k+1];
        prev[0]=curr[0]=true;
        prev[nums[0]]=true;
        for(int i=1;i<n;i++){
            for(int target=1;target<=k;target++){
                boolean nottake = prev[target];
                boolean take=false;
                if(nums[i]<=target) take=prev[target-nums[i]];
                curr[target] = take||nottake;
            }
            prev=curr;
        }
        return prev[k];

    }
    public static void main(String args[]){
        int nums1[] = {1,5,11,5};
        int sum=0;
        for(int i:nums1) sum+=i;
        if(sum%2!=0) System.out.println(false);
        else {int target=sum/2;
        System.out.println(solve(nums1, target));
        System.out.println(solve2(nums1, target));
        System.out.println(solve3(nums1, target, nums1.length-1));
        }
        int nums2[] = {1,2,3,5};
        sum=0;
        for(int i:nums2) sum+=i;
        if(sum%2!=0) System.out.println(false);
        else {
            int target=sum/2;
        System.out.println(solve(nums2, target));
        System.out.println(solve2(nums2, target));
        System.out.println(solve3(nums2, target, nums2.length-1));
    }
    }
}
