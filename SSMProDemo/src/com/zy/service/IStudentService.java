package com.zy.service;

import java.util.List;

import com.zy.pojo.Student;

public interface IStudentService {

	List<Student> queryAllStudent();
	
	Student login(String username,String password);
	
	int delStudentByStuNo(int stuNo);
	
	Student  queryStudentByStuNo(int stuNo);
}
