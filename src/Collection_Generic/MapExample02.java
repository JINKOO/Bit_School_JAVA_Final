package Collection_Generic;

/*
 * 
 *  Map�� �̿��� ��й�ȣ ���� ���� ���α׷�.
 * 
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

class Users {
	
	private String id;
	private String passward;
	
	Users(String id, String passward) {
		this.id = id;
		this.passward = passward;
	}
	
	String getId() {
		return id;
	}
	
	String getPassward() {
		return passward;
	}
	
	void setPassward(String passward) {
		this.passward = passward;
	}
}

public class MapExample02 {

	public static void show(Map<Integer, Users> map) {
		
		Set<Entry<Integer, Users>> entry = map.entrySet();
		for(Entry<Integer, Users> e : entry) {
			System.out.println("ID : " + e.getValue().getId() + ", PW : " + e.getValue().getPassward());
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Map<Integer, Users> map = new HashMap<>();
		
		map.put(1, new Users("������", "1111"));
		map.put(2, new Users("���ؿ�", "2222"));
		map.put(3, new Users("���ȣ", "3333"));
		
		System.out.println("<<��ϵ� ȸ�� ����>>");
		Set<Entry<Integer, Users>> set = map.entrySet();
		
		for(Entry<Integer, Users> e : set) {
			System.out.println(e.getKey() + "��°  ");
			System.out.println("ID : " + e.getValue().getId() + ", PW : " + e.getValue().getPassward());
		}
		
		System.out.println("======================================");
		System.out.print("�����ϰ��� �ϴ� �л� : >>> ");
		
		String name = sc.nextLine();
		
		if(name.equals(map.get(new Integer(1)).getId())) {
			System.out.print("���� �� ��й�ȣ  : " + map.get(1).getPassward());
			System.out.print("���� ��й�ȣ �Է� : ");
			String newPw = sc.nextLine();
			map.get(1).setPassward(newPw);
			System.out.println("��й�ȣ ���� �Ϸ�!");
			show(map);
		} else {
			System.out.println("�ٽ� �Է� �ϼ���");
		}
		
	}
}
