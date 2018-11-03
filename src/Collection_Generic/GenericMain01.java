package Collection_Generic;

import java.util.Random;
import java.util.Scanner;


//모든 최상위 class인 Object형으로 받는경우
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

//제너릭 타입으로 받는 경우
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

		
		//Object형으로 매개변수 넘겨줌.
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
		 * a1은 String형인데 Object형으로 받았으므로 컴파일 에러가 안난다. 실행시 오류 발생
		 * 이와 같은 문제를 해결하기 위해서 Generic기법을 사용한다.
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
