package Collection_Generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WrapperMain02 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(new Integer(10));
		list.add(10);
		
		/*
		 * 
		 * iterator 순환자.
		 * 검색 용도로 많이 쓴다.
		 * 
		 */
		Iterator<Integer> ite = list.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		String str = "12345";
		
		int num = Integer.parseInt(str);
		System.out.println(num + 1);
		
		Integer obj = new Integer(10);
		
		Integer obj2 = new Integer(100); //boxing;
		
		int num2 = obj2.intValue() + 10;
		System.out.println(num2);
		
		int num3 = Integer.parseInt("12345");
		
	}
}
