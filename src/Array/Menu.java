package Array;

import java.util.Scanner;

public class Menu {

	public int scanInt() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		return num;
	}
	
	public void choiceType() {
		
		System.out.print("선택  : 1.배열 증가    2. 배열 뒤집기 >>>");
		int num = scanInt();

		switch(num) {
		
		case 1:
			break;
		case 2:
			break;
		}
	}
}
