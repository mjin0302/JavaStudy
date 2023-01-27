package com.yedam.java.ch03;

public class Course {
	public static void registerCourse1(Applicant<?> applicant) {
		String message = applicant.kind.getClass().getSimpleName() + "이(가) Course1을 등록함";	//getSimpleName
		System.out.println(message);
	}
	
	// Person, Worker만 가능<?super Worker> => (Worker의 부모 클래스만 가능)
	public static void registerCourse2(Applicant<?super Worker> applicant) {
		String message = applicant.kind.getClass().getSimpleName() + "이(가) Course1을 등록함";	//getSimpleName
		System.out.println(message);
	}
	
	// Student, HighStudent, MiddleStudent만 가능<? extends Student> => (부모는 Student이여야 함 -> 자식 클래스 다 가능)
	public static void registerCourse3(Applicant<? extends Student> applicant) {
		String message = applicant.kind.getClass().getSimpleName() + "이(가) Course1을 등록함";	//getSimpleName
		System.out.println(message);
	}
}
