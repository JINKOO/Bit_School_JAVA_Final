package Array;

import java.util.Scanner;

public class Menu {

	public int scanInt() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		return num;
	}
	
	public void choiceType() {
		
		System.out.print("����  : 1.�迭 ����    2. �迭 ������ >>>");
		int num = scanInt();

		switch(num) {
		
		case 1:
			break;
		case 2:
			break;
		}
	}
}
