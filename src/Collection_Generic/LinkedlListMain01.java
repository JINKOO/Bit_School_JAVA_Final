package Collection_Generic;

import java.util.Iterator;
import java.util.LinkedList;

/*
 * 
 * LinkedList에서 iterator쓰면 성능이 훨씬 좋다.
 * -내부적으로 배열이 있는 것이 아니라.
 * -인접한 data를 서로 가리키는 형식이다.
 * 
 * ArrayList의 메소드랑 비슷하다.
 */
public class LinkedlListMain01 {

	public static void main(String[] args) {
		
		//()안에 크기 임의로 지정할 수 있다. 임의 지정 안하면 자동으로 크기 10.
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
