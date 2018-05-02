package edu.handong.csee.java.lab13.prob5;
import java.util.Scanner;

public class Equal {
	public static int equals(int[][] array1, int[][] array2) {
		int cnt = 0;
		if(array1.length != array2.length) {
			return 0;
			}
		for(int i = 0; i < array1.length; i++) {
			for(int j = 0; j < array2.length; j++) {
				if(array1[i][j] != array2[i][j]) {
					cnt = cnt + 1;
				}
			}
		}
		if(cnt <= 3 && cnt > 0) {
			return 1;
		}
		else if(cnt == 0){
			return 2;
		}
		else {
			return 0;
		}
	}
	public static void main(String[] args) {
		acto();
	}

	public static void acto() {
		Scanner keyboard = new Scanner(System.in);
		int column, row = 0;
		System.out.println("Data of First array");
		System.out.println("Type in Column(max 5) : ");
		column = keyboard.nextInt();
		System.out.println("Type in Row(max 5) : ");
		row = keyboard.nextInt();
		int[][] array1 = new int[column][row];
		System.out.println("Data of Second array");
		System.out.println("Type in Column(max 5) : ");
		column = keyboard.nextInt();
		System.out.println("Type in Row(max 5) : ");
		row = keyboard.nextInt();
		int[][] array2 = new int[column][row];
		
		System.out.println("Type in first list : ");
		for(int i = 0; i < array1.length; i++) {
			for(int j = 0; j < array1[i].length; j++) {
				array1[i][j] = keyboard.nextInt();
			}
		}
		
		System.out.println("Type in second list : ");
		for(int i = 0; i < array2.length; i++) {
			for(int j = 0; j < array2[i].length; j++) {
				array2[i][j] = keyboard.nextInt();
			}
		}

		for(int i = 0; i < array1.length; i++) {
			for(int j = 0; j < array1[i].length; j++) {
				System.out.print(array1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i = 0; i < array2.length; i++) {
			for(int j = 0; j < array2[i].length; j++) {
				System.out.print(array2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		if(equals(array1, array2) == 2) {
			System.out.println("The two arrays are identical.");
		}
		else if(equals(array1, array2) == 1) {
			System.out.println("The two arrays are approximately identical.");
		}
		else {
			System.out.println("The two arrays are not identical.");
		}
		keyboard.close();
	}
}
