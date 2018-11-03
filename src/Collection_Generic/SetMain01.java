package Collection_Generic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 * 
 *  Set : 중복(X), 순서(X)
 * 
 * 
 */
public class SetMain01 {

	public static void main(String[] args) {
		
		Set<String> set1 = new HashSet<>();  //정렬된 형태로 나오지 않는다.
		Set<String> set2 = new TreeSet<>();  //정렬된 형태로(사전순)
		
		set1.add("one");
		set1.add("two");
		set1.add("three");
		set2.add("four");
		
		Object[] arr = set1.toArray();
		System.out.println(Arrays.toString(arr));
		
		Iterator<String> ite2 = set1.iterator();
		while(ite2.hasNext()) {
			String str = ite2.next();
			System.out.println(str);
		}
		
		System.out.println("====================");
		
		System.out.println("입력전 data의 개수 : " + set2.size() + "개");
		
		boolean bool = set2.add("one");
		System.out.println("\'one\' 입력 : " + (bool ? "삽입 성공" : "실패"));
		
		set2.add("two");
		set2.add("three");
		set2.add("four");
		set2.add("five");
		
		//중복 된 data가 있으면 동작 안하고 튕겨낸다.
		bool = set2.add("one");
		System.out.println("\'one\' 입력 : " + (bool ? "삽입 성공" : "실패"));
		
		System.out.println("입력 후 data의 개수 : " + set2.size() + "개");
		
		
		/*
		 * Set 전체 데이터 출력.
		 * (Set은 index기반이 아니다.(순서가 없다.)/index로 접근 불가 하다)
		 * 1. 1.5버전이후의 for문
		 * 2. Iterator사용.
		 * 3. toArray()사용.
		 * 
		 */
		
		System.out.println();
		System.out.println("<<1.5버전 for문>>");
		//우리가 입력한 형태대로 나오지 않고 treeSet이기 때문에 사전순으로 나온다.
		for(String str : set2) {
			System.out.println(str);
		}
		
		System.out.println("<<Iterator 사용>>");
		Iterator<String> ite = set2.iterator();
		while(ite.hasNext()) {
			String str = ite.next();
			System.out.println(str);
		}
		
		System.out.println("<<toArray() 사용>>");
		Object[] objarr = set2.toArray();
		System.out.println(Arrays.toString(objarr));
		
	}
}
