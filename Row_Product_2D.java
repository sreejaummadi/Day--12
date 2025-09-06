package com.codegnan.Arrays;

import java.util.Scanner;

public class Row_Product_2D {

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
		for(int i=0;i<rows;i++) {
			int row_product=1;
			for(int j=0;j<col;j++) {
				row_product*=arr[i][j];
			}
			System.out.println("Row "+i+"Product"+row_product);
		}

	}

}
