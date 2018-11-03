package kr.ac.smu.day03;

import java.util.Scanner;

/*
 * 
 * 4개의 정수를 입력 받은 후에
 * 가장 큰 수를 출력.
 * 
 */
public class Exam01Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("4개의 정수 입력");
		
		int num1 = Integer.parseInt(sc.nextLine());
		int num2 = Integer.parseInt(sc.nextLine());
		int num3 = Integer.parseInt(sc.nextLine());
		int num4 = Integer.parseInt(sc.nextLine());
		
		int max = (num1 > num2 ? num1 : num2);
		
		if(num3 > max) 
			max = num3;
		if(num4 > max)
			max = num4;
		
		System.out.println("가장 큰 수 는 " + max);
	}
}
