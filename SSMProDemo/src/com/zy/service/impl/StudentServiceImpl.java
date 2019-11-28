package com.zy.service.impl;

import java.util.List;

import com.zy.mapper.StudentMapper;
import com.zy.pojo.Student;
import com.zy.service.IStudentService;


public class StudentServiceImpl implements IStudentService{
	
	StudentMapper studentMapper;

	public void setStudentMapper(StudentMapper studentMapper) {
		this.studentMapper = studentMapper;
	}

	@Override
	public List<Student> queryAllStudent() {
		return studentMapper.queryAllStudent();
	}

	@Override
	public Student login(String username, String password) {
		return studentMapper.queryLogin(username, password);
	}

	@Override
	public int delStudentByStuNo(int stuNo) {
		return studentMapper.delStudent(stuNo);
	}

	@Override
	public Student queryStudentByStuNo(int stuNo) {
		return studentMapper.queryStudentByStuNo(stuNo);
	}

	
}
