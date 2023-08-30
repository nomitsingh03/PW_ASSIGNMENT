// Q3. Given a collection of numbers, nums, that might contain duplicates, return all possible unique permutations in any order.

package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Que3 {
    
    private static void solve(int[] arr, ArrayList<ArrayList<Integer>> ans, int idx){
        if(idx==arr.length-1) {
            ArrayList<Integer> list = new ArrayList<>();
            for(int num:arr) list.add(num);
            ans.add(list);
            return;
        }
        for(int i=idx;i<arr.length;i++){
            swap(arr, i, idx);
            solve(arr, ans, idx+1);
            swap(arr, i, idx);
        }
    }
    private static void swap(int[] arr, int i, int j){
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args){
        int arr[] = {1, 1, 2};
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        solve(arr, ans, 0);
        ans.stream().distinct().forEach(System.out::println);
        System.out.println("\nSecond array ");
        int arr2[] = {1, 2,3, 3};
        ArrayList<ArrayList<Integer>> ans2 = new ArrayList<>();
        solve(arr2, ans2, 0);
        // HashSet<ArrayList<Integer>> set2 = new HashSet<>(ans2);
        // set2.stream().sorted((a, b) -> a.get(0) - b.get(0)).forEach(System.out::println);
        ans2.stream().distinct().forEach(System.out::println);
        // for(ArrayList<Integer> list:set2){
        //     for(Integer i : list){
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }
    }
}
