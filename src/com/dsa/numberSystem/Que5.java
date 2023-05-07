package com.dsa.numberSystem;

/*
 Q5.Given an integer array, duplicates are present in it in a way that all duplicates appear an even
number of times except one which appears an odd number of times. Find that odd appearing
element in linear time and without using any extra memory.
 */

import java.util.*;

public class Que5 {
	public static int countOdd(int arr[], int m){
        int count = 0;
        int i=0;
        while (m > i) {
           if((arr[i]&1)==1)count++;
            i++;
        }
        return count;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elemnets : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i =0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Number of odd elements : "+ countOdd(arr, n));
	}
//	public static int findOddOccuring(int[] arr)
//    {
//        int xor = 0;
//        for (int i: arr) {
//            xor = xor ^ i;
//        }
//        return xor;
//    }
//	public static void main(String[] args) {
//		int n;  
//        Scanner sc=new Scanner(System.in);  
//        System.out.print("Enter the number of elements you want to store: ");  
//        //reading the number of elements from the that we want to enter  
//        n=sc.nextInt();  
//        //creates an array in the memory of length 10  
//        int[] array = new int[10];  
//        System.out.println("Enter the elements of the array: ");  
//        for(int i=0; i<n; i++)  
//        {  
//        //reading array elements from the user   
//            array[i]=sc.nextInt();  
//        }
//     System.out.println("The odd occurring element is " + findOddOccuring(array));
//	}
}
