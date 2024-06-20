package com.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student 
{
	@Id 
	private int rollno;
	private String name;
	private String batch;
	private int marks;
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", batch=" + batch + ", marks=" + marks + "]";
	}
	public Student()
	{
		
	}
	public Student(int rollno, String name, String batch, int marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.batch = batch;
		this.marks = marks;
	}
	 
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
}

