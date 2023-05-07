package com.dsa.Search;

import java.util.Scanner;

public class Search4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number of elements in an array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter "+ n + " numbers: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
	}
		System.out.println("Enter target number : ");
		int key = sc.nextInt();
		int i=0;
		int count=0;
		while(i<n) {
			if(arr[i]==key) {
				count++;
			}
			
			i++;
		}
		System.out.print("Target "+key+" occurs "+ count + " times.");
	}
}
