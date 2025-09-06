package com.codegnan.Arrays;

import java.util.Scanner;

public class ColumnSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Rows");
		int rows=sc.nextInt();
		System.out.println("enter Number of Columns");
		int columns=sc.nextInt();
		int[][] arr=new int[rows][columns];
		//int col_sum=0;
		System.out.println("Enter Elements into Array");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Element ["+i+"] ["+j+"]");
				arr[i][j]=sc.nextInt();
			}
		}
		for(int j=0;j<columns;j++) {
			int col_sum=0;
			for(int i=0;i<rows;i++) {
				col_sum+=arr[i][j];
			}
			System.out.println("Column" +j+ "Sum"  +col_sum);
		}

	}

}
