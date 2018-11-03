package Collection_Generic;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

class Member {
	
	private String name;
	private String phone;
	
	Member() {
		
	}
	
	Member(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	
	String getName() {
		return name;
	}
	
	String getPhone() {
		return phone;
	}
	
	@Override
	public boolean equals(Object obj) {
		Member m = (Member)obj;
		//���⼭�� equals�� String class�� �������̵� �� equals�� ���� ���̴�.
		if(this.name.equals(m.name) && this.phone.equals(m.phone)) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + phone.hashCode();
	}
	
}

class Car {
	
	private String model;
	private String carNum;
	
	Car(String model, String carNum)  {
		this.model = model;
		this.carNum = carNum;
	}
	
	void setModel(String model) {
		this.model = model;
	}
	
	String getModel() {
		return model;
	}
	
	String getCarNum() {
		return carNum;
	}
}

public class MapExample03 {

	public static void show(Map<Member,Car> map) {
		
		Set<Entry<Member, Car>> entry = map.entrySet();
		for(Entry<Member, Car> e : entry) {
			System.out.println("Name : " + e.getKey().getName());
			System.out.println("Phone : " + e.getKey().getPhone());
			System.out.println("Model : " + e.getValue().getModel());
			System.out.println("CarNum : " + e.getValue().getCarNum());
			System.out.println("==============================");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//�Ķ���� Ÿ���� 2�� ��� ����ڰ� ���� classŸ���̴�.
		Map<Member, Car> map = new HashMap<>();
		
		map.put(new Member("������", "010-3187-5668"), new Car("Universe Noble", "19�� 2648"));
		map.put(new Member("��°�", "010-2991-1193"), new Car("Daewoo Novus 5t", "19�� 2649"));
		map.put(new Member("����", "010-3474-9799"), new Car("��Ÿ���� VGT", "19�� 2618"));
		
		System.out.println("##��ϵ� ���� ��� : " + map.size());
		System.out.println();
		show(map);
		
		//��ϵ� ������ �ٸ� �������� �ٲٰ� �ʹ�.
		
		Member m1 = new Member("������", "010-3187-5668");
		Member m2 = new Member("������", "010-3187-5668");
		
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
//		if(m1 == m2) {
//			System.out.println("m1 == m2");
//		} else {
//			System.out.println("m1 != m2");
//		}
		
		if(m1.equals(m2)) {
			System.out.println("m1 == m2");
		} else {
			System.out.println("m1 != m2");
		}
		
		map.get(m1).setModel("new Superaerocity");
		show(map);		
	}
}
