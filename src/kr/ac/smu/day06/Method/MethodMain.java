package kr.ac.smu.day06.Method;

/*
 * ������ �Է� : 1
 * ������ �Է� : 10
 * 
 * 1~10���� : 55
 * 
 * 
 * 1~100������ 10�� �߻�.
 * 1~100 ������ size�� ����
 * 1~max������ size�� ���.
 */
public class MethodMain {

	public static void main(String[] args) {
		
		Method m = new Method();
		
		int num1 = m.scanInt();
		int num2 = m.scanInt();
		int sum = m.getSum(num1, num2);
		m.infoSum(num1, num2, sum);
		
		System.out.println("================================");
		
		System.out.println("<1~100������ ���� 10�� �߻�>");
		int[] arr = m.getArr();
		m.showArr(arr);
		
		System.out.println("================================");
		
		System.out.println("<1~100������ ���� size�� �߻�>");
		int size = m.scanInt();
		arr = m.getArr(size);
		m.showArr(arr);
		
		System.out.println("================================");
		
		System.out.println("<1~max������ ���� size�� �߻�>");
		int max = m.scanInt();
		int size2 = m.scanInt();
		arr = m.getArr(max, size2);
		m.showArr(arr);
	}
}
