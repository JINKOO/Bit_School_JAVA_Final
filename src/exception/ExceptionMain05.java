package exception;

import java.io.FileReader;
import java.util.Random;

abstract class Parent {

	abstract void read() throws Exception;

	abstract void write();
}

class Child extends Parent {

	@Override
	public void read() throws Exception {

		FileReader fr = new FileReader("iotest.txt");

	}

	public void write() {
	}
}

public class ExceptionMain05 {

	public static void a() {

		try {
			int num = 10 / 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void b() {

		for (int i = -5; i < 5; i++) {
			
			try {
				System.out.println("result : " + 10 / i);
			} catch (Exception e) {
				e.printStackTrace();
			} 
		}
	}

	public static void main(String[] args) {

		System.out.println("main start..");

		Parent p = new Child();

		try {
			p.read();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("=============================");

		try {
			b();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main end...");
	}
}
