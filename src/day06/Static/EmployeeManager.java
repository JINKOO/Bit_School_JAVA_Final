package day06.Static;

public class EmployeeManager extends Employee {

	private Employee[] em;
	private static int count;
	
	public EmployeeManager() {
		this.em = new Employee[3];
	}
	
	public void setEm() {
		for(int i = 0; i<em.length; i++) {
			System.out.println("현재 입사원 수 : " + EmployeeManager.count);
			em[i] = new Employee();
			em[i].setName();
			em[i].setAge();
			System.out.println();
			EmployeeManager.count++;
		}	
	}
	
	public void printList() {
		setEm();
		System.out.println("\t <사원 관리 목록>");
		for(int i = 0; i<em.length; i++) {
			System.out.println("#" + (i+1));
			System.out.println("사원 명 : " + em[i].getName());
			System.out.println("사원 나이 : " + em[i].getAge());
			System.out.println("================");
		}
	}
	
	public static void showCount() {
		System.out.println("현재 입사원 수는 : " + (EmployeeManager.count));
	}
}
