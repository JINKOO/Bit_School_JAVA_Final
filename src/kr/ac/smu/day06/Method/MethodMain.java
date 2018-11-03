package kr.ac.smu.day06.Method;

/*
 * 정수를 입력 : 1
 * 정수를 입력 : 10
 * 
 * 1~10총합 : 55
 * 
 * 
 * 1~100난수를 10개 발생.
 * 1~100 난수를 size개 추출
 * 1~max난수를 size개 출력.
 */
public class MethodMain {

	public static void main(String[] args) {
		
		Method m = new Method();
		
		int num1 = m.scanInt();
		int num2 = m.scanInt();
		int sum = m.getSum(num1, num2);
		m.infoSum(num1, num2, sum);
		
		System.out.println("================================");
		
		System.out.println("<1~100까지의 난수 10개 발생>");
		int[] arr = m.getArr();
		m.showArr(arr);
		
		System.out.println("================================");
		
		System.out.println("<1~100까지의 난수 size개 발생>");
		int size = m.scanInt();
		arr = m.getArr(size);
		m.showArr(arr);
		
		System.out.println("================================");
		
		System.out.println("<1~max까지의 난수 size개 발생>");
		int max = m.scanInt();
		int size2 = m.scanInt();
		arr = m.getArr(max, size2);
		m.showArr(arr);
	}
}
