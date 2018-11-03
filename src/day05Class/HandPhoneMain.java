package day05Class;

import java.util.Scanner;

public class HandPhoneMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		HandPhone[] hp = new HandPhone[3];
		
		for(int i = 0; i < hp.length; i++) {
			hp[i] = new HandPhone();
		}
		
		for(int i = 0; i<hp.length; i++) {
			System.out.println(i+1 + "번");
			hp[i].setName(sc.nextLine());
			hp[i].setPhone(sc.nextLine());
			hp[i].setCompany(sc.nextLine());
		}
		System.out.println("===============================");
		
		System.out.println("관리 사원 목록");
		for(int i = 0; i<hp.length; i++) {
			System.out.println(i+1 + "번");
			System.out.println(hp[i].getName());
			System.out.println(hp[i].getPhone());
			System.out.println(hp[i].getCompany());
			System.out.println("========");
		}
	}
}
