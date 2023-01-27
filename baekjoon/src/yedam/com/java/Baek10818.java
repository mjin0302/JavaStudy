package yedam.com.java;

import java.util.Scanner;

public class Baek10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		int numArr[] = new int[n];
		
		
		for(int i = 0; i < numArr.length; i++) {
			numArr[i] = Integer.parseInt(sc.nextLine());
		}
		
		int max = 0;
		int min = numArr[1];
		
		for(int i = 0; i < numArr.length; i++) {
			if(max < numArr[i]) {
				max = numArr[i];
			} else if(min > numArr[i]) {
				min = numArr[i];
			}
		}
		System.out.println(max + " " + min);

	}

}
