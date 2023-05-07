package com.dsa.Search;

import java.util.Scanner;

public class Search1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter nu[mber of elements in an array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter "+ n + " numbers: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
	}
		System.out.println("ENter number to search : ");
		int key = sc.nextInt();
		int i=0;
		while(i++<n) {
			if(arr[i]==key) {
				System.out.println("elemment "+ key+" found at index = "+i);
				break;
			}
			else if(i>=n) {
				System.out.print("Elements not found ");
			}
		}
	}
}
