package com.dsa.recursion;

//  Q3.Print the max value of the array [ 13, 1, -3, 22, 5].

import java.util.Scanner;

public class Que3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter number of elements in an array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Maximum number in a given Array is : " +maxNum(arr, n));
	}

//	private static int maxNum(int[] arr, int n) {
//		// TODO Auto-generated method stub
//		if(n==0) return arr[0];
//		if(arr[n-1]>maxNum(arr, n-2)) {
//			return arr[n-1];
//		}
//		return null;
//	}

	private static int maxNum(int[] arr, int n) {
		// TODO Auto-generated method stub
		if(n==0) return arr[0];
		return Math.max(arr[n-1], maxNum(arr,n-1));
	}

}
