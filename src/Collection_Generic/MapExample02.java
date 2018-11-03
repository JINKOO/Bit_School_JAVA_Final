package Collection_Generic;

/*
 * 
 *  Map을 이용한 비밀번호 변경 서비스 프로그램.
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
		
		map.put(1, new Users("고진권", "1111"));
		map.put(2, new Users("김준원", "2222"));
		map.put(3, new Users("우상호", "3333"));
		
		System.out.println("<<등록된 회원 정보>>");
		Set<Entry<Integer, Users>> set = map.entrySet();
		
		for(Entry<Integer, Users> e : set) {
			System.out.println(e.getKey() + "번째  ");
			System.out.println("ID : " + e.getValue().getId() + ", PW : " + e.getValue().getPassward());
		}
		
		System.out.println("======================================");
		System.out.print("변경하고자 하는 학생 : >>> ");
		
		String name = sc.nextLine();
		
		if(name.equals(map.get(new Integer(1)).getId())) {
			System.out.print("변경 전 비밀번호  : " + map.get(1).getPassward());
			System.out.print("변경 비밀번호 입력 : ");
			String newPw = sc.nextLine();
			map.get(1).setPassward(newPw);
			System.out.println("비밀번호 변경 완료!");
			show(map);
		} else {
			System.out.println("다시 입력 하세요");
		}
		
	}
}
