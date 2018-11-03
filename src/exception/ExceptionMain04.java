package exception;


/*
 * 
 * throw 키워드
 * 
 * JVM은 예외로 생각 하지 않지만 
 * 사용자가 강제로 예외를 발생 시킴.
 * 
 */

public class ExceptionMain04 {

	public static void main(String[] args) {
		
		for(int i = 0; i<5; i++) {
			
			try {
				if(i == 3) {
					throw new Exception("i가 3이면 안됩니다.");
				} else {
					System.out.println(i);
				}
			} catch(Exception e) {
				e.printStackTrace();
			} 
		}
	}
}
