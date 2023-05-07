package com.dsa.Search;

import java.util.Scanner;

public class Search3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number of elements in an array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int count=0;
		System.out.println("Enter "+ n + " numbers: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]==1) count++;
		}
		System.out.println(count);
		
	}
}
