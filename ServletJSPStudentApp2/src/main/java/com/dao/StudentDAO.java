package com.dao;

import java.util.List;

import com.model.Student;

public interface StudentDAO {
	 int saveStudent(Student student);
	 int deleteStudent(int id);
	 int updateStudent(Student student);
	 List<Student> getAllStudents();
	 Student findStudentById(int id);
}
