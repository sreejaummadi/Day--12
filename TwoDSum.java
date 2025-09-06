package com.codegnan.Arrays;

import java.util.Scanner;

public class TwoDSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Rows");
		int rows=sc.nextInt();
		System.out.println("Enter Number of coloums");
		int col=sc.nextInt();
		int[][] arr=new int[rows][col];
		System.out.println("Enter Elements into Array");
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;arr[i].length<col;j++) {
				System.out.println("Elements ["+i+"] ["+j+"]: ");
				arr[i][j]=sc.nextInt();
				sum+=arr[i][j];
			}
		}
		System.out.println("Sum of elements in 2D array : "+sum);
	}

}
