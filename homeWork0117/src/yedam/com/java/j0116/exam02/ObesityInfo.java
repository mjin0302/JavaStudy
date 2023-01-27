package yedam.com.java.j0116.exam02;

public class ObesityInfo extends StandardWeightInfo {
	
	//필드
		
	//생성자
	public ObesityInfo(String name, int height, int weight) {
		super(name, height, weight);
	}
	
	//메소드
	public double getObesity() {
		double getObesity = (weight - standardWeight)/standardWeight * 100;
		return getObesity;
	}

	@Override
	public void getInformation() {
		super.getInformation();
		System.out.println(getObesity() + "입니다.");
	}
	
}
