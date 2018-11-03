package day06.Static;

public class EmployeeManager extends Employee {

	private Employee[] em;
	private static int count;
	
	public EmployeeManager() {
		this.em = new Employee[3];
	}
	
	public void setEm() {
		for(int i = 0; i<em.length; i++) {
			System.out.println("���� �Ի�� �� : " + EmployeeManager.count);
			em[i] = new Employee();
			em[i].setName();
			em[i].setAge();
			System.out.println();
			EmployeeManager.count++;
		}	
	}
	
	public void printList() {
		setEm();
		System.out.println("\t <��� ���� ���>");
		for(int i = 0; i<em.length; i++) {
			System.out.println("#" + (i+1));
			System.out.println("��� �� : " + em[i].getName());
			System.out.println("��� ���� : " + em[i].getAge());
			System.out.println("================");
		}
	}
	
	public static void showCount() {
		System.out.println("���� �Ի�� ���� : " + (EmployeeManager.count));
	}
}
