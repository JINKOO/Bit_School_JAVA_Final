package Collection_Generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
 * 
 * 
 * 키보드로 부터 문자열을 입력받아
 * ArrayList에 삽입하고 
 * 가장 긴 이름을 출력하라.
 * 
 * 
 */
public class ArrayListMain03 {

	public static void show(List<String> list) {

		for (int index = 0; index < list.size(); index++) {
			System.out.println(list.get(index));
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<String> list = new ArrayList<String>();
		List<String> sub = new ArrayList<String>();

		for (int i = 0; i < 4; i++) {
			System.out.print((i + 1) + "번 문자열: ");
			String str = sc.nextLine();
			sub.add(str);
		}

		list.addAll(sub);
		System.out.println(list.size());
		ArrayListMain03.show(list);

		int longindex = 0;
//		for(int i = 1; i<list.size(); i++) {
//			if(list.get(longindex).length() < list.get(i).length()) {
//				longindex = i;
//			}
//		}
		
		int max = list.get(0).length();
		for (int i = 1; i < list.size(); i++) {
			if (max < list.get(i).length()) {
				max = list.get(i).length();
			}

		}
		
		for(int i = 0; i<list.size(); i++) {
			if(max == list.get(i).length()) {
				System.out.println("가장 긴 문자열 : " + list.get(i));
			}
		}
	}
}
