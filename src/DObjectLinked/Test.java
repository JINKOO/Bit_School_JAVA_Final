package DObjectLinked;

class A {
	
	public static String str;
}

class B extends A {

}

public class Test {
	
	public static int num1;
	
	public static void main(String[] args) {
		
		A a = new A();
		
		a.str = "hello";
	}
}
