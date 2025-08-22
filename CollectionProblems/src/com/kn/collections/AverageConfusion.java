package com.kn.collections;

import java.util.Scanner;

public class AverageConfusion {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Size of an Array");
		int size=scan.nextInt();
		int[] arr=new int[size];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
			
		}
		System.out.println("Original Array Elements");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	for(int i=0;i<arr.length;i++) {
		if(arr[i]<10) {
			arr[i]=arr[i]*2;
		}			
	}
	System.out.println("Here is the Updated Array");
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	System.out.println("Printing the Average Here");
	int sum=0;
	for(int i=0;i<arr.length;i++) {
		sum=sum+arr[i];
		
	}
	double average=(double)sum/arr.length;
	System.out.println(average);
	scan.close();
	

	}

}
