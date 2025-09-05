package com.codegnan.Arrays;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Rows");
		int Rows=sc.nextInt();
		System.out.println("Enter Number of Coloums");
		int colums=sc.nextInt();
		int[][] arr=new int[Rows][colums];
		System.out.println("Emter Elements Into Array");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Elements ["+i+"] ["+j+"]: ");
				arr[i][j]=sc.nextInt();
			}
		}
		for(int[] row:arr) {
			for(int x:row) {
				System.out.print(x+" ");
			}
			System.out.println();
		}
	}
}
//sum of all elements 2d array
//row wise sum & product
//column wise sum & product
//add matrices
//multiply two matrices