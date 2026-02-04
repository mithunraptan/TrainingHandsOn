package com.studentavg;

import java.util.Scanner;

public class StringPractice {
	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your string ");
		
		String s = sc.nextLine();
		
		String[] wordsArray = s.split(" ");

		String modifiedString = ""; // Hi There 
		
		for(int i= 0; i<wordsArray.length; i++) {
			String words = wordsArray[i];
			String firstCharCap = words.substring(0, 1).toUpperCase(); // capital first character
			
			String capitalWord = words.replace(words.charAt(0), firstCharCap.charAt(0));
			
			//concatinating part
			modifiedString = modifiedString.concat(capitalWord);
			modifiedString = modifiedString + " ";					
		}
		
			System.out.println(modifiedString);
		
		
		
	}

}
