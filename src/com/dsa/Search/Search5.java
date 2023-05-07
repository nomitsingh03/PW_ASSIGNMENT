package com.dsa.Search;

import java.util.Scanner;

public class Search5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number to check number is perfect square or not ? : ");
		int n = sc.nextInt();
		boolean check=false;
		int ans=0;
		for(int i=1;i<n/2;i++) {
		if(n==(i*i)) {
			check=true;
			break;
		}
		}
//		
		if(check){
			System.out.print("true " );
		} else {
		System.out.print("false ");
		
		}
	}
}
