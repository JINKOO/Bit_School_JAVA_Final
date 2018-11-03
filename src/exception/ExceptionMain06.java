package exception;

import java.util.Scanner;

class EmptyArray extends Exception {
	
	EmptyArray() {
		super("�迭�� ���� ��� �ֽ��ϴ�.");
	}
}

class OutofIndex extends Exception {
	
	OutofIndex() {
		super("�迭 Index�� �߸��Ǿ����ϴ�.");
	}
}



public class ExceptionMain06 {

	public static int scanInt() {
		
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		return num;
	}
	
	public static void setArray() throws Exception {
		
		System.out.print("�迭 ���� �Է� >>> ");
		int length = scanInt();
		
		if(length < 0) {
			throw new OutofIndex();
		} else {
			int[] arr = new int[length];
		}
	}
	
	public static void main(String[] args) {
		
		try {
			setArray();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("�ٽ� �Է� ??? ");
	}
}
