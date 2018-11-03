package kr.ac.smu.day03;

import java.util.Random;

public class Exam02Main {

	public static void main(String[] args) {
		
		Random r = new Random();
		int num1 = r.nextInt(10);
		int num2 = r.nextInt(10);
		int num3 = r.nextInt(10);
		
		System.out.print("추출된 정수 3개 [" + num1 + ", " + num2 + ", " + num3 + "]");
		System.out.println();
		
		int max;
		int min;
		
		if(num1 > num2) {
			max = num1;
			min = num2;
		} else {
			max = num2;
			min = num1;
		}
		
		if(num3 > max) {
			System.out.println("[" + min + ", " + max + ", " + num3 + "]");
		} else if(num3 > min && num3 < max) {
			System.out.println("[" + min + ", " + num3 + ", " + max + "]");
		} else {
			System.out.println("[" + num3 + ", " + min + ", " + max + "]");
			
		}
		
	}
}
