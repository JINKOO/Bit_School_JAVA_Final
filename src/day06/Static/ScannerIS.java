package day06.Static;

import java.util.Scanner;

public class ScannerIS {

	private Scanner sc;
	
	public ScannerIS() {
		this.sc = new Scanner(System.in);
	}
	
	public String scanStr(String name) {
		System.out.print("����� >>> ");
		name = sc.nextLine();
		return name;
	}
	
	public int scanInt(int age) {
		System.out.print("��� ���� >>> ");
		age = Integer.parseInt(sc.nextLine());
		return age;
	}
}
