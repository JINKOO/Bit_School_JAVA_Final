package kr.ac.smu.day03;

import java.util.Scanner;

/*
 * 
 * 4���� ������ �Է� ���� �Ŀ�
 * ���� ū ���� ���.
 * 
 */
public class Exam01Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("4���� ���� �Է�");
		
		int num1 = Integer.parseInt(sc.nextLine());
		int num2 = Integer.parseInt(sc.nextLine());
		int num3 = Integer.parseInt(sc.nextLine());
		int num4 = Integer.parseInt(sc.nextLine());
		
		int max = (num1 > num2 ? num1 : num2);
		
		if(num3 > max) 
			max = num3;
		if(num4 > max)
			max = num4;
		
		System.out.println("���� ū �� �� " + max);
	}
}
