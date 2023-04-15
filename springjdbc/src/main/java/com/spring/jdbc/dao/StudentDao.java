package com.spring.jdbc.dao;

import com.spring.jdbc.entity.Student;

public interface StudentDao {
	public void insert(Student student);
	public void updateDetails(Student student);
	public void remove(int id);
	public Student getDetails(int id);
}
