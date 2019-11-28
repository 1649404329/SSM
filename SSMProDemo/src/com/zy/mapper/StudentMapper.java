package com.zy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zy.pojo.Student;

public interface StudentMapper {

	List<Student> queryAllStudent();
	Student queryLogin(@Param("username") String username,@Param("password")String password);
	
	int delStudent(@Param("stuNo")int stuNo);
	
	Student queryStudentByStuNo(@Param("stuNo")int stuNo);
}
