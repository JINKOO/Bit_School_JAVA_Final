package Collection_Generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/*
 * 
 * ��ü�� �� equals(), hashCode()
 * 
 * Object class�� �ִ� �޼ҵ� �̴�.
 * (���ڿ� ���Ҷ��� equals()�� String class�� Object�� ��� �ޱ� ������
 *  String class���� ���ڿ� ���ϴ� �������� ������ �� ���̴�.)
 *  
 * <<�����ǹ���ɺ� �ǹ��ٹ������� ���ٹ������� ���ۼҴ� ������ɼ� ���α׷�>>
 * 
 */

class Members {

	private String name;
	private String grade;

	Members(String name, String grade) {
		this.name = name;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public String getGrade() {
		return grade;
	}

	@Override
	public int hashCode() {
		return name.hashCode() + grade.hashCode();
	}

	@Override
	public boolean equals(Object obj) {

		Members m = (Members) obj;

		if (this.name.equals(m.name) && this.grade.equals(m.grade)) {
			return true;
		} else {
			return false;
		}
	}
}

class Susong {

	private String model;
	private String carNum;
	private String destination;

	Susong(String model, String carNum, String destination) {
		this.model = model;
		this.carNum = carNum;
		this.destination = destination;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setCarNum(String carNum) {
		this.carNum = carNum;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getModel() {
		return model;
	}

	public String getCarNum() {
		return carNum;
	}

	public String getDestination() {
		return destination;
	}

}

public class MapMain04 {

	public static void show(Map<Members, Susong> map) {

		System.out.println("\t<<2018�� 2�� 18�� ���� ��ɼ�>>");
		System.out.println("\t\t\t �ۼ��� : �Ϻ� �̿���");

		Set<Entry<Members, Susong>> entry = map.entrySet();
		for (Entry<Members, Susong> e : entry) {
			System.out.println("��  ��  �� : " + e.getKey().getName());
			System.out.println("��       �� : " + e.getKey().getGrade());
			System.out.println("���� ���� : " + e.getValue().getModel());
			System.out.println("���� ��ȣ : " + e.getValue().getCarNum());
			System.out.println("��  ��  �� : " + e.getValue().getDestination());
			System.out.println("====================================");
		}

		System.out.println("\t �����ǹ���ɺ� �ǹ��ٹ������� ���ٹ������� ��� ȫ����(��)");
	}

	public static void show(List<String> list) {

		for (String str : list) {
			System.out.print("���� : ");
			System.out.println(str);
		}
		System.out.println("-------------------------------");
	}

	public static void show(Set<String> set) {
		System.out.println("<<���� ���� ���� ��Ȳ>>");
		
		Object[] arr = set.toArray();
		for(int i = 0; i<arr.length; i++) {
			System.out.println((i+1) + ". " + (String)arr[i]);
		}
	}

	/**
	 * �������� ��Ȳ �����ִ� �޼ҵ�. Set���� �������� ���� �����.
	 * 
	 * @return �������� ������ Set<String> set
	 */
	public static Set<String> usableCar() {

		Scanner sc = new Scanner(System.in);

		Set<String> set = new HashSet<>();
		set.add("19�� 2619");
		set.add("19�� 2617");
		set.add("19�� 2641");

		return set;
	}

	/**
	 * ���� ���� ��Ȳ���� �����ϴ� �޼ҵ�.
	 * 
	 * @param set
	 * @return
	 */
	public static String selectCar(Set<String> set) {

		Scanner sc = new Scanner(System.in);
		System.out.print("��ü ���� ���� �ϼ��� >>> ");
		int num = Integer.parseInt(sc.nextLine());
		
		Object[] arr = set.toArray();
		
		String str = null;
		
		switch(num) {
		case 1:
			str = (String)arr[num-1];
			break;
		case 2:
			str = (String)arr[num-1];
			break;
		case 3:
			str = (String)arr[num-1];
			break;
		default:
			System.out.println("�ٽ� �Է� �ϼ���");
		}
		
		return str;
	}

	public static void main(String[] args) {

		Map<Members, Susong> map = new HashMap<>();

		map.put(new Members("������", "����"), new Susong("�� ���Ϳ���ν�Ƽ", "19�� 2645", "������"));
		map.put(new Members("��°�", "����"), new Susong("�� ���Ϳ���ν�Ƽ", "19�� 2620", "�ܴ���Ÿ�"));
		map.put(new Members("������", "����"), new Susong("����Ƽ 3.5��", "19�� 2642", "���� 55���"));

		MapMain04.show(map);
		System.out.println();

		System.out.println("\t<<2018�� 2�� 18�� ������ �ݳ� ���� ����>>");
		List<String> list = new ArrayList<>();
		list.add("19�� 2645");
		show(list);

		// 2645������ ���� ������ ��������. �ٸ� ���������� ��ü �ؾ��Ѵ�.

		// ���� �������� ���� ������ �ٸ� �������� ��ü.
		Members m1 = new Members("������", "����");

		String str = map.get(m1).getCarNum();
		/*
		 * ���� ���⼭ �̷��� �ϸ� str�� �ƹ� �͵� ������ �ʴ�. newŰ���带 ��� �����̴�. ("������", "����") �̶�� �Ķ���ʹ�
		 * ������ ��ü�� �ּҰ� �ٸ���. ��ü�� �����ؾ��Ѵ�. => equals() ������// hashMap�̹Ƿ� hash�ڵ嵵 ���ƾ��Ѵ�.=>
		 * hashCode() ������.
		 * 
		 * put, get()�� equals�� hasCode�� �̿��Ͽ� key�� �ش��ϴ� Value�� ã�´�.
		 * 
		 */
		System.out.println("���� ���� ������ ���� ���� ��ȣ : " + str);

		// ���⼭ equals()�� String class�� ���ڿ� �� �޼ҵ�(Object���� �������̵� �� �޼ҵ�)
		if (list.get(0).equals(map.get(m1).getCarNum())) {
			System.out.println("���� ������ �ٲ�� �մϴ�!");
			Set<String> set = MapMain04.usableCar();
			MapMain04.show(set);
			String reCar = MapMain04.selectCar(set);
			map.get(m1).setCarNum(reCar);
		} else {
			System.out.println("�ش� ���� ����.");
		}

		MapMain04.show(map);
	}
}
