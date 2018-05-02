package edu.handong.csee.java.lab13.prob5;
import java.util.Scanner;// import scanner to get input.

public class Equal {// declare class for prob5.
	public static int equals(int[][] array1, int[][] array2) {// declare static method to know if each elements of arrays are equal.
		int cnt = 0;// declare an integer variable to store count.
		if(array1.length != array2.length) {// if the length of two given arrays are not equal,
			return 0;// return 0.
			}
		for(int i = 0; i < array1.length; i++) {// start loop with length of array1.
			for(int j = 0; j < array2.length; j++) {// start loop with length of array2
				if(array1[i][j] != array2[i][j]) {// if each elements of arrays are not equal,
					cnt = cnt + 1;// add 1 to count.
				}
			}
		}
		if(cnt <= 3 && cnt > 0) {// if count is smaller than 3 and bigger than 0,
			return 1;// return 1.
		}
		else if(cnt == 0){// if count is 0,
			return 2;// return 2.
		}
		else {// or else,
			return 0;// return 0.
		}
	}
	public static void main(String[] args) {// declare main method.
		acto();// initiate acto method.
	}

	public static void acto() {// declare a method that does what should be done in main method.
		Scanner keyboard = new Scanner(System.in);// initiate scanner for getting input.
		int column, row = 0;// declare two integer variables to store column and row.
		System.out.println("Data of First array");// let user know what array this data is typed for.
		System.out.println("Type in Column(max 5) : ");// ask user to give column.
		column = keyboard.nextInt();// assign next given integer as column.
		System.out.println("Type in Row(max 5) : ");// ask user to give row
		row = keyboard.nextInt();// assign next given integer as row.
		int[][] array1 = new int[column][row];// declare a new array with given column and row.
		System.out.println("Data of Second array");// let user know what array this data is typed for.
		System.out.println("Type in Column(max 5) : ");// ask user to give column.
		column = keyboard.nextInt();// assign next given integer to column.
		System.out.println("Type in Row(max 5) : ");// ask user to give row.
		row = keyboard.nextInt();// assign next given integer to row.
		int[][] array2 = new int[column][row];// declare a new array with secondly given column and row.
		
		System.out.println("Type in first list : ");// ask user to type in first list.
		for(int i = 0; i < array1.length; i++) {// start loop with length of array1.
			for(int j = 0; j < array1[i].length; j++) {// start loop with length of each column of array1.
				array1[i][j] = keyboard.nextInt();// assign next given integer to each element of array1.
			}
		}
		
		System.out.println("Type in second list : ");// ask user to type in second list.
		for(int i = 0; i < array2.length; i++) {// start loop with length of array2.
			for(int j = 0; j < array2[i].length; j++) {// start loop with length of each column of array2.
				array2[i][j] = keyboard.nextInt();// assign next given integer to each element of array2.
			}
		}

		for(int i = 0; i < array1.length; i++) {// start loop with length of array1.
			for(int j = 0; j < array1[i].length; j++) {// start loop with length of each column of array1.
				System.out.print(array1[i][j] + " ");// print out the elements of array1.
			}
			System.out.println();// give new lines at end of each column.
		}
		System.out.println();// give new line to differentiate arrays.
		
		for(int i = 0; i < array2.length; i++) {// start loop with length of array2.
			for(int j = 0; j < array2[i].length; j++) {// start loop with length of each column of array2.
				System.out.print(array2[i][j] + " ");// print out the elements of array2.
			}
			System.out.println();// give new lines at end of each column.
		}
		System.out.println();// give new line at the end of arrays.
		
		if(equals(array1, array2) == 2) {// if return for equals method for array1 and array2 equals 2,
			System.out.println("The two arrays are identical.");// print out that two arrays are same.
		}
		else if(equals(array1, array2) == 1) {// if return for equals method for array1 and array2 equals 1,
			System.out.println("The two arrays are approximately identical.");// print out that two arrays are approximately same.
		}
		else {// or else,
			System.out.println("The two arrays are not identical.");// print out that two arrays are not same.
		}
		keyboard.close();// close the scanner.
	}
}
