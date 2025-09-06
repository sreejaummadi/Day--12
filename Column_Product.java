package com.codegnan.Arrays;

import java.util.Scanner;

public class Column_Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Rows");
		int rows = sc.nextInt();
		System.out.println("Enter Number of Columns ");
		int col=sc.nextInt();
		int[][] arr=new int[rows][col];
		System.out.println("Enter Elements into Array");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Elements ["+i+"] ["+j+"]");
				arr[i][j]=sc.nextInt();
			}
		}
		for(int j=0;j<col;j++) {
			int col_product=1;
			for(int i=0;i<rows;i++) {
				col_product*=arr[i][j];
			}
			System.out.println("Row "+j+"Product"+col_product);
		}

	}

}
