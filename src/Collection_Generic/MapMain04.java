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
 * 객체의 비교 equals(), hashCode()
 * 
 * Object class에 있는 메소드 이다.
 * (문자열 비교할때의 equals()는 String class가 Object를 상속 받기 때문데
 *  String class에서 문자열 비교하는 목적으로 재정의 한 것이다.)
 *  
 * <<국군의무사령부 의무근무지원단 재경근무지원대 수송소대 배차명령서 프로그램>>
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

		System.out.println("\t<<2018년 2월 18일 배차 명령서>>");
		System.out.println("\t\t\t 작성자 : 일병 이영재");

		Set<Entry<Members, Susong>> entry = map.entrySet();
		for (Entry<Members, Susong> e : entry) {
			System.out.println("운  전  병 : " + e.getKey().getName());
			System.out.println("계       급 : " + e.getKey().getGrade());
			System.out.println("운행 차량 : " + e.getValue().getModel());
			System.out.println("차량 번호 : " + e.getValue().getCarNum());
			System.out.println("목  적  지 : " + e.getValue().getDestination());
			System.out.println("====================================");
		}

		System.out.println("\t 국군의무사령부 의무근무지원단 재경근무지원대 대령 홍기태(인)");
	}

	public static void show(List<String> list) {

		for (String str : list) {
			System.out.print("오전 : ");
			System.out.println(str);
		}
		System.out.println("-------------------------------");
	}

	public static void show(Set<String> set) {
		System.out.println("<<현재 가용 차량 현황>>");
		
		Object[] arr = set.toArray();
		for(int i = 0; i<arr.length; i++) {
			System.out.println((i+1) + ". " + (String)arr[i]);
		}
	}

	/**
	 * 가용차량 현황 보여주는 메소드. Set으로 가용차량 집합 만든다.
	 * 
	 * @return 가용차량 집합인 Set<String> set
	 */
	public static Set<String> usableCar() {

		Scanner sc = new Scanner(System.in);

		Set<String> set = new HashSet<>();
		set.add("19국 2619");
		set.add("19국 2617");
		set.add("19국 2641");

		return set;
	}

	/**
	 * 가용 차량 현황에서 선택하는 메소드.
	 * 
	 * @param set
	 * @return
	 */
	public static String selectCar(Set<String> set) {

		Scanner sc = new Scanner(System.in);
		System.out.print("대체 차량 선택 하세요 >>> ");
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
			System.out.println("다시 입력 하세요");
		}
		
		return str;
	}

	public static void main(String[] args) {

		Map<Members, Susong> map = new HashMap<>();

		map.put(new Members("고진권", "병장"), new Susong("뉴 슈터에어로시티", "19국 2645", "오리역"));
		map.put(new Members("백승건", "병장"), new Susong("뉴 슈터에어로시티", "19국 2620", "단대오거리"));
		map.put(new Members("김진선", "병장"), new Susong("마이티 3.5톤", "19국 2642", "용인 55사단"));

		MapMain04.show(map);
		System.out.println();

		System.out.println("\t<<2018년 2월 18일 정비팀 반년 정비 차량>>");
		List<String> list = new ArrayList<>();
		list.add("19국 2645");
		show(list);

		// 2645차량은 오늘 운행을 못나간다. 다른 대형버스로 교체 해야한다.

		// 병장 고진권의 운행 차량을 다른 차량으로 교체.
		Members m1 = new Members("고진권", "병장");

		String str = map.get(m1).getCarNum();
		/*
		 * 현재 여기서 이렇게 하면 str에 아무 것도 들어가있지 않다. new키워드를 썼기 때문이다. ("고진권", "병장") 이라는 파라미터는
		 * 같지만 객체의 주소가 다르다. 객체가 동등해야한다. => equals() 재정의// hashMap이므로 hash코드도 같아야한다.=>
		 * hashCode() 재정의.
		 * 
		 * put, get()는 equals와 hasCode를 이용하여 key에 해당하는 Value를 찾는다.
		 * 
		 */
		System.out.println("현재 병장 고진권 운행 차량 번호 : " + str);

		// 여기서 equals()는 String class의 문자열 비교 메소드(Object에서 오버라이딩 된 메소드)
		if (list.get(0).equals(map.get(m1).getCarNum())) {
			System.out.println("운행 차량을 바꿔야 합니다!");
			Set<String> set = MapMain04.usableCar();
			MapMain04.show(set);
			String reCar = MapMain04.selectCar(set);
			map.get(m1).setCarNum(reCar);
		} else {
			System.out.println("해당 사항 없음.");
		}

		MapMain04.show(map);
	}
}
