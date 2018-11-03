package Collection_Generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListMain04 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(14);
		
		Iterator<Integer> ite = list.iterator();
		
		int sum = 0;
		while(ite.hasNext()) {
			int n = ite.next();  //next를 2번 쓰면 안되.
			System.out.println(n);
			sum = sum + n;
		}
		
		
		
		System.out.println(sum);
	}
}
