package exception;

/*
 * 
 * finally문 특징.
 * 
 * 원래try문에서 예외가 발생하면 예외 발생 순간
 * 곧바로 catch문으로 간다.
 * 
 * 이때 try문의 예외 발생 시점 이후의 코드들은 수행이 안된다.
 * 수행되고 싶게 하고 싶을때는 
 * finally를 사용한다.
 * 주로 반복분, return타입에서 많이 사용한다.
 * 
 * 
 */

public class ExceptionMain02 {

	@SuppressWarnings("finally")
	public static void main(String[] args) {

		System.out.println("Main start...");
		
		for(int i = -2; i<10; i++) {
			
			try {
				System.out.println("i : " + i +  " , result :  " + (10/i));
				
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("main end...");
	}
}
