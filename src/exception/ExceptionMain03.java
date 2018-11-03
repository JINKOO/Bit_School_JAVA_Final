package exception;

/*
 * 
 * try문 하나
 * 여러개의 catch문
 * 
 * 
 */
public class ExceptionMain03 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		String str = "hello";
		
		System.out.println("Main start...");
		
		try {
			arr[5] = 10;
			//여기서 예외가 발생하니까 아래 코드는 수행 되지 않는다.
			char ch = str.charAt(5);
			int result = arr[1] / 0;
			
		} catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch(ArithmeticException b) {
			b.printStackTrace();
		}
		System.out.println("Main end...");
	}
}
