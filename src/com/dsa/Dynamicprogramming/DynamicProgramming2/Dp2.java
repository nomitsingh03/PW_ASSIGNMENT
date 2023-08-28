/* Q2. You are a professional robber planning to rob houses along a street. Each house has a certain amount of 
money stashed. All houses at this place are arranged in a circle. That means the first house is the neighbor of 
the last one. Meanwhile, adjacent houses have a security system connected, and it will automatically 
contact the police if two adjacent houses were broken into on the same night.

Given an integer array nums representing the amount of money of each house, return the maximum 
amount of money you can rob tonight without alerting the police. */

package DynamicProgramming2;

import java.util.ArrayList;

public class Dp2 {

    // private static int solve(ArrayList<Integer> list){
    //     int n=list.size();
    //     int sum[] = new int[n];
    //     sum[0]=0;
    //     if(list.size()==1) list.get(0);
    //     sum[1]=list.get(0);
    //     for(int i=2;i<n;i++){
    //         sum[i] = Math.max(list.get(i-1)+sum[i-2], sum[i-1]);
    //     }
    //     return sum[n-1];
    // }

     public static int rob(int[] nums) {
        if (nums.length == 0)
            return 0;
        if (nums.length < 2)
            return nums[0];
        
        int[] startFromFirstHouse = new int[nums.length + 1];
        int[] startFromSecondHouse = new int[nums.length + 1];
        
        startFromFirstHouse[0]  = 0;
        startFromFirstHouse[1]  = nums[0];
        startFromSecondHouse[0] = 0;
        startFromSecondHouse[1] = 0;
        
        for (int i = 2; i <= nums.length; i++) {
            startFromFirstHouse[i] = Math.max(startFromFirstHouse[i - 1], startFromFirstHouse[i - 2] + nums[i-1]);
            startFromSecondHouse[i] = Math.max(startFromSecondHouse[i - 1], startFromSecondHouse[i - 2] + nums[i-1]);
        }
        
        return Math.max(startFromFirstHouse[nums.length - 1], startFromSecondHouse[nums.length]);
    }
    public static void main(String args[]){
        // int[] nums = {2,3,2};
        int nums[] = {1,2,3,1};
        int n = nums.length;
        // ArrayList<Integer> list1 = new ArrayList<>();  
        // ArrayList<Integer> list2 = new ArrayList<>();
        
        // for(int i=0;i<n;i++){
        //     if(i!=0) list1.add(nums[i]);
        //     if(i!=n-1) list2.add(nums[i]);
        // }  
        // System.out.println("Maximum money robbed by thief = " + Math.max(solve(list1),solve(list2)));
        System.out.println("Maximum money robbed by thief = " + rob(nums));
    }
}
