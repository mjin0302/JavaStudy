package yedam.com.java;

import java.util.Scanner;

public class Baek2525 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();	//현재시각
		int m = sc.nextInt();	//현재 분
		int n = sc.nextInt();	//요리하는데 필요한 시간

		// 모든 시간을 분으로 바꿔줌
		int a = h * 60 + m + n;
		h = a / 60;
		m = a % 60;

		// h가 24를 넘는다면?
		if (h >= 24) {
			h = h - 24;
		}

		System.out.println(h + " " + m);

	}

}
