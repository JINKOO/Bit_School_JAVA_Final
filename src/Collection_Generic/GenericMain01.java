package Collection_Generic;

import java.util.Random;
import java.util.Scanner;


//��� �ֻ��� class�� Object������ �޴°��
class A {
	
	private Object obj;
	
	A() {
		
	}
	
	A(Object obj) {
		this.obj = obj;
	}
	
	void setObj(Object obj) {
		this.obj = obj;
	}
	
	Object getObj() {
		return obj;
	}
	
	void info() {
		System.out.println("obj : " + obj);
	}
	
}

//���ʸ� Ÿ������ �޴� ���
class B<T> {
	
	private T obj;

	
	B(T obj) {
		this.obj = obj;
	}
	
	void setObj(T obj) {
		this.obj = obj;
	}
	
	T getObj() {
		return obj;
	}
	
	void info() {
		System.out.println("obj : " + obj);
	}
}

public class GenericMain01 {

	public static void main(String[] args) {

		
		//Object������ �Ű����� �Ѱ���.
		A a1 = new A(new String());
		A a2 = new A(new Random());
		
		String str1 = (String)a1.getObj();
		Random r1 = (Random)a2.getObj();
		
		try {
			Random r2 = (Random)a1.getObj();
		} catch(Exception e) {
			e.getMessage();
		}
		
		System.out.println("obj : " + str1);
		System.out.println("obj : " + r1);
		
		/*
		 * a1�� String���ε� Object������ �޾����Ƿ� ������ ������ �ȳ���. ����� ���� �߻�
		 * �̿� ���� ������ �ذ��ϱ� ���ؼ� Generic����� ����Ѵ�.
		 * 
		 */
		
		System.out.println("===================================");
		
		B<String> b1 = new B<String>(new String());
		B<Random> b2 = new B<Random>(new Random());
		
		String str2 = b1.getObj();
		Random r3 = b2.getObj();
		
		System.out.println("obj : " + str2);
		System.out.println("obj : " + r3);
	}
}
