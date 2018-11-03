package exception;

import java.util.Random;

class MyRandom extends Random {

	@Override
	public int nextInt(int num) {
		int nums = super.nextInt(num) + 1;
		return nums;
	}
}

public class ExceptionMain01 {

	public static void main(String[] args) {

		System.out.println("main start...");

		Random r = new MyRandom();

		int num = r.nextInt(3) - 1; // 1~100 원래는 0-99
		
		try {
			System.out.println(10 / num);
			System.out.println("고진권");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		} finally {
			
		}
		System.out.println("main end...");
		
		System.out.println(num);
	}
}
