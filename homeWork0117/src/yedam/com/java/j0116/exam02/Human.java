package yedam.com.java.j0116.exam02;

public class Human {
	// 필드
   public String name; //이름
   public int height; // 키
   public int weight; //몸무게
   
   //생성자
   public Human(String name, int height, int weight) {
      this.name = name;
      this.height = height;
      this.weight = weight;
   }
   
   //메서드
   public void getInformation() {
      System.out.print(this.name + "님의 신장 " + this.height + ", 몸무게 " + this.weight);
   }

}
