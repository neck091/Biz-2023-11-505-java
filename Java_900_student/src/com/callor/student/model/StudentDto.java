package com.callor.student.model;

public class StudentDto {

	public String num;
	public String name;
	public String dept;
	public String grade;
	public String addr;
	public String tel;
	
	//기본생성자
	public StudentDto() {
		// TODO Auto-generated constructor stub
	}
	
	//필드 생성자 (임의 생성자)
	//StudentDto 클래스를 사용하여 객체를 생성할 때 
	//모든 멤버변수를 주입하여 값이 채워진 채로 객체를 만들 때 사용하는 생성자
	
	/**
	 * 
	 * @param num, 학번
	 * @param name, 이름
	 * @param dept, 학과 
	 * @param grade, 학년
	 * @param addr, 주소,
	 * @param tel, 전화
	 */
	public StudentDto(String num, String name, String dept, String grade, String addr, String tel) {
		super();
		this.num = num;
		this.name = name;
		this.dept = dept;
		this.grade = grade;
		this.addr = addr;
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "StudentDto [num=" + num + ", name=" + name + ", dept=" + dept + ", grade=" + grade + ", addr=" + addr
				+ ", tel=" + tel + "]";
	}

	
	
}
