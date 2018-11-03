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
		list.add(new User("고진권", "1234"));
		list.add(new User("김준원", "4567"));
		list.add(new User("우상호", "78910"));
		
		System.out.println("<<회원 등록 정보>>");
		for(User use : list) {
			System.out.println("ID : " + use.getId() + ", PW : " + use.getPassward());
		}
		
		System.out.println("==========================");
		
		System.out.println(list.get(0).getId());
		System.out.println("변경하고자 하는 학생 입력 : ");
		String name = sc.nextLine();
		
		if(name.equals(list.get(0).getId())) {
			System.out.println("기존 비밀번호 : " + list.get(0).getPassward());
			System.out.print("새로운 비밀 번호를 입력 하세요 : ");
			String newPassward = sc.nextLine();
			
			if(newPassward.length() < 8) {
				try {
					throw new WrongPW("비밀 번호는 8글자 이상이어야 합니다.");
				} catch (WrongPW e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				System.out.println("변경하지 못했습니다.");
			} else {
				list.get(0).setPassward(newPassward);
				System.out.println("비밀 번호 변경 완료 하였습니다!");
			}
		}
		
		System.out.println("<<수정된 회원 등록 정보>>");
		for(User use : list) {
			System.out.println("ID : " + use.getId() + ", PW : " + use.getPassward());
		}
	}
}
