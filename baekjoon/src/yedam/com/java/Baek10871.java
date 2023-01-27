package yedam.com.java;

import java.util.Scanner;

public class Baek10871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x = sc.nextInt();
		int numArr[] = new int[n];

		for (int i = 0; i < n; i++) {
			numArr[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			if (numArr[i] < x) {
				System.out.print(numArr[i] + " ");
			}
		}

	}

}
