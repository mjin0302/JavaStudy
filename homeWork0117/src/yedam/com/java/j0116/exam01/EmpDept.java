package yedam.com.java.j0116.exam01;

public class EmpDept extends Employee {
	
	//필드
	private String departmentName;
	
	//생성자 
	public EmpDept(String name, int salary, String departmentName) {
		super(name, salary);
		this.departmentName = departmentName;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	@Override
	public void getInformation() {
		super.getInformation();
		System.out.println("  부서 : " + departmentName);
	}

	@Override
	public void print() {
		super.print();
		System.out.println("\n서브클래스");
		
	}
	
	//메소드
	

}
