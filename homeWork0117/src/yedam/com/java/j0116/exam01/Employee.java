package yedam.com.java.j0116.exam01;

public class Employee {
	
	//필드 
	private String name;
	private int salary;
	
	//생성자 
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}
	
	//메소드
	public void getInformation() {
		System.out.print("이름 : " + name + "  연봉 : " + salary);
	}
	
	public void print() {
		System.out.println("수퍼클래스");
	}
	
}
