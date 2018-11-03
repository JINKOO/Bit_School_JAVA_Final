package Collection_Generic;

import java.util.Iterator;
import java.util.LinkedList;

/*
 * 
 * LinkedList���� iterator���� ������ �ξ� ����.
 * -���������� �迭�� �ִ� ���� �ƴ϶�.
 * -������ data�� ���� ����Ű�� �����̴�.
 * 
 * ArrayList�� �޼ҵ�� ����ϴ�.
 */
public class LinkedlListMain01 {

	public static void main(String[] args) {
		
		//()�ȿ� ũ�� ���Ƿ� ������ �� �ִ�. ���� ���� ���ϸ� �ڵ����� ũ�� 10.
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("apple");
		list.add("peach");
		list.add("watermelon");
		
		list.set(1, "ko");
		
		Iterator<String> ite = list.iterator();
		
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		System.out.println(list.size());
	}
}
