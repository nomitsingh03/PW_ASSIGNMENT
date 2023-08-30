// Q2. Given an integer array arr, print all the possible permutations of the given array.

package BackTracking;

import java.util.ArrayList;

public class Que2 {
    private static void solve(int[] arr, ArrayList<ArrayList<Integer>> ans, int idx){
        if(idx==arr.length-1) {
            ArrayList<Integer> list = new ArrayList<>();
            for(int num:arr) list.add(num);
            ans.add(list);
            return;
        }
            for(int i=idx;i<arr.length;i++){
                swap(arr, idx, i);
                solve(arr, ans, idx+1);
                swap(arr, idx, i);
            }
    }

    private static void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }

    public static void main(String[] args){
        int arr[]={1,2,3};
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        System.out.println("Possible permutations are : ");
        solve(arr, ans, 0);
        for(ArrayList<Integer> list: ans){
            for(Integer i: list){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
