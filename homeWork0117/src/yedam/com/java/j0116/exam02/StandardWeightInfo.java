package yedam.com.java.j0116.exam02;

public class StandardWeightInfo extends Human {
	
	//필드
	double standardWeight = getStandardWeight();
	
	//생성자
	public StandardWeightInfo(String name, int height, int weight) {
		super(name, height, weight);
	}
	
	//메소드
	public double getStandardWeight() {
		standardWeight = (super.height - 100) * 0.9;
		return standardWeight;
	}

	@Override
	public void getInformation() {
		super.getInformation();
		System.out.println(", 표준 체중 " + standardWeight + " 입니다.");
	}
	
	
}
