package day06.Constructor;

class A {
	
	A() {
		
	}
	
	A(int x) {
		
	}
}

class B extends A {

	private int age;
	private String addr;
	
	B() {
		this(-1);
	}
	
	B(int age) {
		this(age, "�� �� ����");
	}
	
	B(int age, String addr) {
		this.age = age;
		this.addr = addr;
	}
	
	void show() {
		System.out.println(age + " " + addr);
	}
}

public class ConstuctorMain {

	public static void main(String[] args) {
	
		A a = new A();
		
		B b1 = new B();
		B b2 = new B(25);
		B b3 = new B(32, "����");
		
		b1.show();
		b2.show();
		b3.show();
	}
}
