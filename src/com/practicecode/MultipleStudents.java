package com.practicecode;

import java.util.Scanner;

public class MultipleStudents {
	
	
	
	private static void calculateSum(int[][] studentArray) {
		int sum = 0;
		for(int i = 0 ; i<studentArray.length; i++) {
			for(int j=0; j<studentArray[i].length; j++) {
				sum +=studentArray[i][j];
			}
			
			System.out.println((i+1) +" number student total is : "+ sum);
			sum=0; // re-initialized sum = 0; for second student mark calculation
		}
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter students count: ");
		int studentCount = sc.nextInt(); 
		System.out.println("enter subjects count: ");
		int subjectCount = sc.nextInt(); 
		
		int [][] studentArray = new int [studentCount][subjectCount];
		
		for(int i = 0 ; i<studentArray.length; i++) {
			for(int j=0; j<studentArray[i].length; j++) {
				System.out.println("enter "+ (i+1) +" student "+" marks of "+(j+1)+" subject" );
				int mark = sc.nextInt();
				studentArray[i][j]=mark;
			}
		}

		//System.out.println(studentArray[1][1]);
		
		calculateSum(studentArray);
		
		
		
	}



}
