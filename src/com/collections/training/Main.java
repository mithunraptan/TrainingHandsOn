package com.collections.training;

import java.util.Set;
import java.util.TreeSet;

public class Main{
	

	
	public static void main(String[] args) {
		
		Set<Student> studentList = new TreeSet<>(new IdComparator());
		studentList.add(new Student(101, "mithun", 25));
		studentList.add(new Student(102, "sagar", 24));
		studentList.add(new Student(102, "sagar", 24));
		studentList.add(new Student(103, "Ayan", 26));
		
		//Collections.sort(studentList, new IdComparator());
		
		
		for(Student stud : studentList) {
			System.out.println(stud.getStudName());
		}
		
		
		
		
	}
	
	

}
