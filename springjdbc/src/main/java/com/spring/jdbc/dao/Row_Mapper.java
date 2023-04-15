package com.spring.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entity.Student;

public class Row_Mapper implements RowMapper<Student> {

	public Student mapRow(ResultSet resultSet, int id) throws SQLException {
		// getting the details form the DataBase by using the column name id
		// RowMapper is the template which in-built implementation in which it return's the data as a Object
		Student student = new Student();
		student.setId(resultSet.getInt(1));
		student.setName(resultSet.getString(2));
		student.setCity(resultSet.getString(3));
		return student;
	}

}
