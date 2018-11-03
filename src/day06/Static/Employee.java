package day06.Static;

public class Employee {

	private String name;
	private int age;
	private ScannerIS sc;
	
	public Employee() {
		this.sc = new ScannerIS();
	}
	
	public void setName() {
		this.name = sc.scanStr(name);
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge() {
		this.age = sc.scanInt(age);
	}
	
	public int getAge() {
		return age;
	}
}
