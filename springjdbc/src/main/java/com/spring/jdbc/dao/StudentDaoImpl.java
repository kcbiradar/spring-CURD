package com.spring.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entity.Student;

public class StudentDaoImpl implements StudentDao {
	
	private JdbcTemplate template;
	// method / query for inserting student into table
	public void insert(Student student) {
		String query = "insert into student(id , name , city) values(? , ? , ?)";
		this.template.update(query , student.getId() , student.getName(), student.getCity());
		System.out.println("Data added successfully!");
	}
	// method / query for updating existing data in table
	public void updateDetails(Student student) {
		String query = "update student set name=?, city=? where id=?";
		this.template.update(query ,student.getName() , student.getCity(),student.getId());
		System.out.println("Data is modified successfully!");
	}
	// method / query for deletion of existing data in table
	public void remove(int id) {
		String query = "delete from student where id = ?";
		this.template.update(query , id);
		System.out.println("Data is removed successfully!!");
	}
	
	// extracting data from database...
	
	public Student getDetails(int id) {
		String query = "select * from student where id = ?";
		RowMapper<Student> rowMapper = new Row_Mapper();
		Student student = this.template.queryForObject(query, rowMapper , id);
		return student;
	}
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	public JdbcTemplate getTemplate() {
		return template;
	}
}
