package com.codegnan.Arrays;

import java.util.Scanner;

public class MultiDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[][] a= {{100,110,80},{60,80}};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Printing 2D array in enhancing Array");
		for(int[] row:a) {
			for(int x:row) {
				System.out.print(x+" ");
			}
			System.out.println();
		}
	}
}