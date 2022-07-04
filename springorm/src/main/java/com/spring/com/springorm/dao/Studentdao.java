package com.spring.com.springorm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.com.springorm.entities.Student;

public abstract class Studentdao {

	private HibernateTemplate hibernateTemplate;

	// save student
	@Transactional
	public int insert(Student student) {
		Integer i = (Integer) this.hibernateTemplate.save(student);
		return i;
	}

	// get read data
	public Student getStudent(int studentID) {
		Student student = this.hibernateTemplate.get(Student.class, studentID);
		return student;
	}

	// get load all data
	public List<Student> getAllStudents() {

		List<Student> students = this.hibernateTemplate.loadAll(Student.class);
		return students;
	}

	// delete the data
	@Transactional
	public void deleteStudent(int studentID) {
		Student student = this.hibernateTemplate.get(Student.class, studentID);
		this.hibernateTemplate.delete(student);
	}

	// update the data
	@Transactional
	public void updateStudent(Student student) {

		this.hibernateTemplate.update(student);

	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;

	}
}
