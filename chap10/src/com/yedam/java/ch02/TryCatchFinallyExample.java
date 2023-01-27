package com.yedam.java.ch02;

import java.util.Scanner;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		
		//일반 예외
		try {
			//실행 하고자 하는 코드
			Class clazz = Class.forName("java.lang.String2"); //java.lang.String2의 클래스 정보를 가지고 있음(필드, 생성자, 메소드)
			
		} catch (ClassNotFoundException e) {	//ClassNotFoundException타입의 e(변수명)
			//e.printStackTrace(); //해당되는 예외 메세지를 모두 출력함(예외가 왜 발생했는지 정확한 정보를 가지고 있음)
			System.out.println("해당 클래스가 존재하지 않습니다.");
		}
		
		//실행 에외
		String data1 = null;
		String data2 = null;
		try {
			data1 = args[0];
			data2 = args[1];
			
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.printf("%s + %s = %d \n", data1, data2, result);
			
			throw new ClassCastException();	//해당 예외 클래스를 강제로 생성함
			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개 값의 수가 부족 합니다.");
		} catch(NumberFormatException e) {
			System.out.println("숫자로 변환 할 수 없습니다.");
		} catch(Exception e) {
			System.out.println("정상적으로 실행되지 않았습니다.");
			//return;	//프로그램 종료
		} finally {	//항상 어떤 경우든 무조건 실행
			System.out.println("프로그램이 종료 되었습니다.");
		}
		
		findClass();	
	}
	
	public static void findClass() throws NullPointerException {	//발생 시키고자 하는 예외를 throws 키워드를 통해 발생시킴
		String className = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("찾고자 하는 클래스 이름을 적어 주세요");
		className = sc.nextLine();
		
		if(className == null | className.equals("")) {
			throw new NullPointerException();	//throw 예외 클래스를 발생시킴(예외 클래스는 상속 받아서 자식 클래스를 생성 할 수 있음)
		}
		try {	//내부에서 예외를 처리하지 않으면 호출되는 함수쪽으로 넘기고 그 다음 메인까지 올라감
			Class clazz = Class.forName(className);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 	
	}
}
