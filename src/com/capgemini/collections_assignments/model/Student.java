package com.capgemini.collections_assignments.model;

public class Student implements Comparable<Student> {
	private int studentRollNo;
	private String studentName;
	private String StudentCourse;
	private String fruit;
	public Student() {
		super();
		
	}
	public Student(int studentRollNo, String studentName, String studentCourse, String fruit) {
		super();
		this.studentRollNo = studentRollNo;
		this.studentName = studentName;
		this.StudentCourse = studentCourse;
		this.fruit = fruit;
	}
	public int getStudentRollNo() {
		return studentRollNo;
	}
	public void setStudentRollNo(int studentRollNo) {
		this.studentRollNo = studentRollNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentCourse() {
		return StudentCourse;
	}
	public void setStudentCourse(String studentCourse) {
		StudentCourse = studentCourse;
	}
	
	public String getFruit() {
		return fruit;
	}
	public void setFruit(String fruit) {
		this.fruit = fruit;
	}
		
	@Override
	public String toString() {
		return "Student [studentRollNo=" + studentRollNo + ", studentName=" + studentName + ", StudentCourse="
				+ StudentCourse + ", fruit=" + fruit + "]";
	}
	@Override
	public int compareTo(Student student) {
		return this.studentName.compareTo(student.studentName);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fruit == null) ? 0 : fruit.hashCode());
		result = prime * result + ((studentName == null) ? 0 : studentName.hashCode());
		result = prime * result + studentRollNo;
		return result;	
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if(!(obj instanceof Student))
			return false;
		if(obj == this)
			return true;
		Student student = (Student)obj;
		if(this.studentName == student.studentName && this.fruit == student.fruit)
			return true;
		else
		    return false;
	}
	
}
