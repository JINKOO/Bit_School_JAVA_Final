package exception;


/*
 * 
 * throw Ű����
 * 
 * JVM�� ���ܷ� ���� ���� ������ 
 * ����ڰ� ������ ���ܸ� �߻� ��Ŵ.
 * 
 */

public class ExceptionMain04 {

	public static void main(String[] args) {
		
		for(int i = 0; i<5; i++) {
			
			try {
				if(i == 3) {
					throw new Exception("i�� 3�̸� �ȵ˴ϴ�.");
				} else {
					System.out.println(i);
				}
			} catch(Exception e) {
				e.printStackTrace();
			} 
		}
	}
}
