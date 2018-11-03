package kr.ac.smu.day02.Exam;

import java.util.Scanner;

public class Exam_3_Process {

	private Scanner sc;

	public Exam_3_Process() {
		this.sc = new Scanner(System.in);
	}

	public int choice() {
		int num = Integer.parseInt(sc.nextLine());
		return num;
	}

	public void execute() {

		Exam_3_Child c = new Exam_3_Child();

		System.out.print("정수 입력 : ");
		int num1 = choice();
		System.out.print("정수 입력 : ");
		int num2 = choice();
		System.out.println();

		c.add(num1, num2);
		c.sub(num1, num2);
		c.mul(num1, num2);
		c.div(num1, num2);
		System.out.println();
		c.check(num1, num2);

	}
}
