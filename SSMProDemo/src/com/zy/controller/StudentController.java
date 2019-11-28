package com.zy.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zy.exception.LoginFailException;
import com.zy.pojo.Student;
import com.zy.service.impl.StudentServiceImpl;

@Controller
@RequestMapping(value = "/student")
public class StudentController {
	@Autowired
	@Qualifier("studentService")
	StudentServiceImpl studentService;
	
	public void setStudentService(StudentServiceImpl studentService) {
		this.studentService = studentService;
	}

	/**
	 * 登录
	 * @param username
	 * @param password
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/login.html")
	public String studentLogin(
				@RequestParam(value = "username",required = true) String username,
				@RequestParam(value = "password",required = true) String password,
				HttpSession session,Model model){
		Student student = studentService.login(username,password);
		if(student!=null){
			//成功，跳转到主页
			session.setAttribute("student", student);
			model.addAttribute(student);
			return "index";
//			使用重定向时用这种方式，找到/student/main.html
//			return "redirect:/student/main.html";
		}
		throw new LoginFailException("用户名或密码不正确");
	}
	
	//重定向方式跳转
	@RequestMapping(value = "/main.html")
	public String studentLogin(){
		return "index";
	}
	
	/**
	 * 学生列表
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/studentList.html")
	public String studentZList(Model model){
			List<Student> studentList = studentService.queryAllStudent();
			model.addAttribute(studentList);
			return "studentList";
	}
	
    /**
     * 注销
     * @param session
     * @param request
     * @return
     */
    @RequestMapping(value = "/logout.html")
    public String logout( HttpSession session,HttpServletRequest request){
        session.invalidate();//会话失效
        request.setAttribute("message","注销成功!");
        return "login";
    }
	
	/**
	 * 删除学生根据stuNo
	 * @param stuNo
	 * @return
	 */
	@RequestMapping(value = "/delStudent.html")
    public String delStudent(@RequestParam(value = "stuNo",required = true) int stuNo){
		studentService.delStudentByStuNo(stuNo);
		return "redirect:/student/studentList.html";
    }
	
	/**
	 * 使用rest风格
	 * 查看学生详细信息
	 * @param stuNo
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/{stuNo}")
    public String queryStudentByStuNo(@PathVariable int stuNo,Model model){
		Student student = studentService.queryStudentByStuNo(stuNo);
		model.addAttribute(student);
		return "studentView";
    }
	
	
	//局部异常处理   如果需要全局异常处理可以在springmvc-servlet.xml中配置
	//@ExceptionHandler
	public String handleException(Exception e, HttpServletRequest request){
        request.setAttribute("message",e.getMessage());
        return "login";
    }
}
