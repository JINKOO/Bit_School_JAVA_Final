package Collection_Generic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class WrongPW extends Exception {
	
	WrongPW(String message) {
		super(message);
	}
}

class User {
	
	private String id;
	private String passward;
	
	User(String id, String passward) {
		this.id = id;
		this.passward = passward;
	}
	
	String getId() {
		return id;
	}
	
	String getPassward() {
		return passward;
	}
	
	void setPassward(String newPassward) {
		this.passward = newPassward;
	}
}

public class MapExample01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<User> list = new ArrayList<User>();
		list.add(new User("������", "1234"));
		list.add(new User("���ؿ�", "4567"));
		list.add(new User("���ȣ", "78910"));
		
		System.out.println("<<ȸ�� ��� ����>>");
		for(User use : list) {
			System.out.println("ID : " + use.getId() + ", PW : " + use.getPassward());
		}
		
		System.out.println("==========================");
		
		System.out.println(list.get(0).getId());
		System.out.println("�����ϰ��� �ϴ� �л� �Է� : ");
		String name = sc.nextLine();
		
		if(name.equals(list.get(0).getId())) {
			System.out.println("���� ��й�ȣ : " + list.get(0).getPassward());
			System.out.print("���ο� ��� ��ȣ�� �Է� �ϼ��� : ");
			String newPassward = sc.nextLine();
			
			if(newPassward.length() < 8) {
				try {
					throw new WrongPW("��� ��ȣ�� 8���� �̻��̾�� �մϴ�.");
				} catch (WrongPW e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				System.out.println("�������� ���߽��ϴ�.");
			} else {
				list.get(0).setPassward(newPassward);
				System.out.println("��� ��ȣ ���� �Ϸ� �Ͽ����ϴ�!");
			}
		}
		
		System.out.println("<<������ ȸ�� ��� ����>>");
		for(User use : list) {
			System.out.println("ID : " + use.getId() + ", PW : " + use.getPassward());
		}
	}
}
