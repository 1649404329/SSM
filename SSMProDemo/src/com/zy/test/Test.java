package com.zy.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zy.pojo.Student;
import com.zy.service.IStudentService;
import com.zy.service.impl.StudentServiceImpl;

public class Test {
	public static void main(String[] args) {
		queryAllStudent();
	}
	
	public static void queryAllStudent(){
		ApplicationContext ac =new ClassPathXmlApplicationContext("applicationContext.xml");
		
		StudentServiceImpl studentService = (StudentServiceImpl) ac.getBean("studentService");
		System.out.println("------------"+studentService);
		List<Student> studentList = studentService.queryAllStudent();
		for (Student student : studentList){
			System.out.println(student);
		}
		
	}

}
