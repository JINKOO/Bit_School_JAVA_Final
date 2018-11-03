package exception;

import java.util.Scanner;

class EmptyArray extends Exception {
	
	EmptyArray() {
		super("배열이 현재 비어 있습니다.");
	}
}

class OutofIndex extends Exception {
	
	OutofIndex() {
		super("배열 Index가 잘못되었습니다.");
	}
}



public class ExceptionMain06 {

	public static int scanInt() {
		
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		return num;
	}
	
	public static void setArray() throws Exception {
		
		System.out.print("배열 길이 입력 >>> ");
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
		
		System.out.println("다시 입력 ??? ");
	}
}
