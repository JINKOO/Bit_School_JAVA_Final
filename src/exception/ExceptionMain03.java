package exception;

/*
 * 
 * try�� �ϳ�
 * �������� catch��
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
			//���⼭ ���ܰ� �߻��ϴϱ� �Ʒ� �ڵ�� ���� ���� �ʴ´�.
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
