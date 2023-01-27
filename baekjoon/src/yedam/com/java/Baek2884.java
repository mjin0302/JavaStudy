package yedam.com.java;

import java.util.Scanner;

//입력받은 분(minute) 을 45 기준으로 45보다 작으면 시(hour)을 -1 해주고 
//아닐경우 입력받은 분(minute)에 -45 를 해주면 된다.
//또한 시(hour)가 0보다 작아질 경우 시(hour) 을 23으로 수정해준다.
public class Baek2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("시간을 입력하세요");
		int H = sc.nextInt(); // 시
		System.out.println("분을 입력하세요");
		int M = sc.nextInt(); // 분
		sc.close();

		if (M < 45) {	//45분보다 작을때
			H--; // 시(hour) 1 감소
			M = 60 - (45 - M); // 분(min) 감소
			if (H < 0) {	//0보다 작으면 23시이기 때문
				H = 23;
			}
			System.out.println(H + " " + M);
		} else {
			System.out.println(H + " " + (M - 45));
		}

	}

}
