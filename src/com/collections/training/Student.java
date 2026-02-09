package com.collections.training;

import java.util.Objects;

public class Student {
	
	int studId;
	String studName;
	int studAge;
	
	public Student(int studId, String studName, int studAge) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.studAge = studAge;
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public int getStudAge() {
		return studAge;
	}

	public void setStudAge(int studAge) {
		this.studAge = studAge;
	}

	@Override
	public int hashCode() {
		return Objects.hash(studId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return studId == other.studId;
	}
	

}
