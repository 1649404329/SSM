package com.zy.pojo;

public class Student {
	private Integer stuNo;
	private String stuName;
	private String stuClass;
	private int stuAge;
	private int stuSex;
	private String password;
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getStuNo() {
		return stuNo;
	}
	public void setStuNo(Integer stuNo) {
		this.stuNo = stuNo;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuClass() {
		return stuClass;
	}
	public void setStuClass(String stuClass) {
		this.stuClass = stuClass;
	}
	public int getStuAge() {
		return stuAge;
	}
	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}
	public int getStuSex() {
		return stuSex;
	}
	public void setStuSex(int stuSex) {
		this.stuSex = stuSex;
	}
	public Student(Integer stuNo, String stuName, String stuClass, int stuAge, int stuSex) {
		super();
		this.stuNo = stuNo;
		this.stuName = stuName;
		this.stuClass = stuClass;
		this.stuAge = stuAge;
		this.stuSex = stuSex;
	}
	public Student() {
		super();
	}
	
	@Override
	public String toString() {
		return "Student [stuNo=" + stuNo + ", stuName=" + stuName + ", stuClass=" + stuClass + ", stuAge=" + stuAge
				+ ", stuSex=" + stuSex + "]";
	}
	
	
}
