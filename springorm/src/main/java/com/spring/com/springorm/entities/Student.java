package com.spring.com.springorm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student-details")
public class Student {
	@Id
	@Column(name = "student_id")
	private int studentID;
	@Column(name = "student_name")
	private String studentName;
	@Column(name = "student_department")
	private String studentDepartment;
	@Column(name = "student_country")
	private String studentCountry;
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getSrudentDepartment() {
		return studentDepartment;
	}
	public void setStudentDepartment(String studentDepartment) {
		this.studentDepartment = studentDepartment;
	}
	public String getStudentCountry() {
		return studentCountry;
	}
	public void setStudentCountry(String studentCountry) {
		this.studentCountry = studentCountry;
	}
	
	public Student(int studentID, String studentName, String studentDepartment, String studentCountry) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentDepartment = studentDepartment;
		this.studentCountry = studentCountry;
	}
}
