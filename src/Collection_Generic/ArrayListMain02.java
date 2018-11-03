package Collection_Generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListMain02 {

	public static void show(List<String> list) {
		
		Iterator<String> ite = list.iterator();
		while(ite.hasNext()) {
			System.out.println("과목 명 : " + ite.next());
		}
	}
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		if(list.isEmpty()) {
			List<String> subList = new ArrayList<String>();
			subList.add("자료구조");
			subList.add("선형대수학");
			subList.add("자연과학의 세계");
			
			list.addAll(subList);
		}
		
		
		ArrayListMain02.show(list);
		System.out.println(list.size());
		System.out.println("====================================");
		
		if(list.contains("자료구조")) {
//			int i = list.indexOf("자료구조");
//			String str = list.remove(i);
//			System.out.println("삭제된 과목 : " + str);
//			ArrayListMain02.show(list);
			
			boolean bool = list.remove("자료구조");
			ArrayListMain02.show(list);
			System.out.println(list.size());
		}
	}
}
