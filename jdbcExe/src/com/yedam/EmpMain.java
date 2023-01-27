package com.yedam;

import java.util.List;
import java.util.Scanner;

public class EmpMain {

	// 사용자 입력값을 받아서 처리
	EmpDAO dao = new EmpDAO();
	Scanner scn = new Scanner(System.in);

	public void exe() {

		while (true) {
			System.out.println("1)목록조회 | 2)단건조회 | 3)입력 | 4)수정 | 5)삭제 | 9)종료");
			int menu = scn.nextInt();

			if (menu == 5) {
				// 삭제
				remove();
			} else if (menu == 4) { 
				// 수정
				modify();
			} else if (menu == 3) {
				// 입력
				add();
			} else if (menu == 2) {
				// 단건조회
				search();
			} else if (menu == 1) {
				// 목록조회
				list();
			} else if (menu == 9) {
				// 종료
				break;
			}
		} // end of while()

		System.out.println("End Of Program");

	} // end of main()

	// 목록 조회
	public void list() {
//		List<Map<String, Object>> result = dao.empList(); // 반환유형
//
//		for (Map<String, Object> map : result) {
//			System.out.println("사원번호 : " + map.get("emp_id") + ", 이름 : " + map.get("first_name") + "-"
//					+ map.get("last_name"));
//		}

		List<EmpVO> list = dao.empVoList();
		for (EmpVO emp : list) {
			System.out.println(emp.toString());
		}

	} // end of list method

	// 단건조회 search()
	public void search() {
		System.out.println("조회사원번호 입력 > ");
		int id = scn.nextInt();

		EmpVO emp = dao.getEmp(id);
		if (emp == null) {
			System.out.println("조회된 정보 없음!!");
			return;
		} // 반환유형 : EmpVO

		System.out.println("결과 : " + emp);
	} // end of search method

	// 입력 add()
	public void add() {
		// 입력처리 => 사원번호, last_name, email, 입사일자, 직무
		System.out.println("사번 입력 > ");
		int eid = scn.nextInt();
		scn.nextLine();

		System.out.println("이름 > ");
		String name = scn.nextLine();

		System.out.println("이메일 > ");
		String mail = scn.nextLine();

		System.out.println("입사일자 > ");
		String hDate = scn.nextLine();

		System.out.println("직무 > ");
		String job = scn.nextLine();

		EmpVO emp = new EmpVO();
		emp.setEmployeeId(eid);
		emp.setLastName(name);
		emp.setEmail(mail);
		emp.setHireDate(hDate);
		emp.setJobId(job);

		if (dao.addEmp(emp) > 0) {
			System.out.println("입력 성공 !!");
		} else {
			System.out.println("처리중 에러!!");
		}

	} // end of add method

	// 수정 modify()
	public void modify() {
		// 급여변경 => 사원번호, 급여를 입력받고, updateEmp(int id, int sal)메소드 만들어서 만들기
		System.out.println("사원 번호 입력 > ");
		int eid = scn.nextInt();
		System.out.println("변경 급여 입력 > ");
		int sal = scn.nextInt();

		if (dao.updateEmp(eid, sal) > 0) {
			System.out.println("수정 성공 !!");
		} else {
			System.out.println("처리중 에러!!");
		}
	} // end of modify method

	// 삭제 remove()
	public void remove() {
		System.out.println("사원 번호 입력 > ");
		int eid = scn.nextInt();

		if (dao.deleteEmp(eid) > 0) {
			System.out.println("삭제 성공 !!");
		} else {
			System.out.println("처리중 에러!!");
		}
	} // end of remove method

} // end of class
