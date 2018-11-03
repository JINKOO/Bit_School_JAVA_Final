package kr.ac.smu.day02;

import java.util.Scanner;

/*
 * 
 * byte < char, short < int < long < float < double
 * 
 * 
 */
public class CastMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.print("문자 하나 입력 : ");
		char ch = sc.nextLine().charAt(0);
		
		System.out.println(num);
		System.out.println(ch);
	}
}
