package com.codegnan.Arrays;

import java.util.Scanner;

public class Matrix_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number of Rows");
		int row=sc.nextInt();
		System.out.println("Enter Number of Columns");
		int column=sc.nextInt();
		int[][] arr1=new int[row][column];
		System.out.println("Enter Elements Into Matrix1");
		//matrix1
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				System.out.println("Matrix 1 Element ["+i+"] ["+j+"]");
				arr1[i][j]=sc.nextInt();
			}
		}
		//printing matrix1 
		System.out.print("Matrix1");
		for(int[] row1:arr1) {
			for(int x:row1) {
				System.out.print(x+" ");
			}
			System.out.println();
		}
		//matrix2
		int[][] arr2=new int[row][column];
		System.out.println("Enter Elements Into Matrix2");
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				System.out.println("Matrix 2 Element ["+i+"] ["+j+"]");
				arr2[i][j]=sc.nextInt();
			}
		}
		//printing matrix2
		System.out.print("Matrix2");
		for(int[] row2:arr1) {
			for(int y:row2) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
		int[][] Result_Matrix=new int[row][column];
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				Result_Matrix[i][j] =arr1[i][j]+arr2[i][j];
			}
		}
		System.out.println("Printing Result Matrix");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.print(Result_Matrix[i][j]+ " ");
			}
			System.out.println();
		}
	

	}

}
