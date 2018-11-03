package Abstract;

abstract class Char {
	
	Char next;
	
	Char() {
		System.out.println("»ý¼ºÀÚ");
		next = null;
	}
	
	abstract void print();
}

class A extends Char {
	
	public void print() {
		System.out.println("A");
	}
}

class B extends Char {
	
	public void print() {
		System.out.println("B");
	}
}

class C extends Char {
	
	public void print() {
		System.out.println("C");
	}
}

public class Test {

	public static void main(String[] args) {
		
		Char head, link;
		
		head = new A();
		
		link = head;
		link.next = new B();
		
		link = link.next;
		link.next = new A();
		
		link = link.next;
		link.next = new C();
		
		while(head!= null) {
			head.print();
			head = head.next;
		}
	}
}
