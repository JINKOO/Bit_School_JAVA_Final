package exception;

/*
 * 
 * finally�� Ư¡.
 * 
 * ����try������ ���ܰ� �߻��ϸ� ���� �߻� ����
 * ��ٷ� catch������ ����.
 * 
 * �̶� try���� ���� �߻� ���� ������ �ڵ���� ������ �ȵȴ�.
 * ����ǰ� �Ͱ� �ϰ� �������� 
 * finally�� ����Ѵ�.
 * �ַ� �ݺ���, returnŸ�Կ��� ���� ����Ѵ�.
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
