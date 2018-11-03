package kr.ac.smu.day03;

import java.util.Scanner;

public class Exam05Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("알파벳 한 문자를 입력하시오 : ");
		char ch = sc.nextLine().charAt(0);
		char ch2 = 'a';
		
		for(int i = 'a'; i <= ch; i++) {
			int count = 5;
			for(int j = 0; j <= ch -'a'; j++) {
				if(j < count) 
					System.out.print((char)(ch2 + j));
			}
			count--;
			System.out.println();
		}
	}
}
