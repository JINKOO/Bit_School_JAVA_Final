package Collection_Generic;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*
 * 
 * List 특징 : 순서 상관 유 // 중복 허용 유
 * 
 * List<E>
 * 구현 class : 1.Vector 2. ArrayList 3.LinkedList
 * 
 * 메소드
 *  
 *  add(E e)         : data 입력
 *  addAll(List l)   : 리스트의 전제데이터 입력
 *  get(int i)       : 리스트의 임의의 데이터 추출
 *  E remove(int i)  : 해당 index데이터 삭제 / 리턴값 : 삭제한 data
 *  boolean remove(E e) : 해당 data삭제 / 리턴값 : 삭제 유무
 *  clear()             :전체 data 삭제
 *  size()              :리스트의 전체 data 개수
 *  boolean contains(E e) : 해당 data존재유무 판단
 *  boolean isEmpty()     :리스트가 비어있는지 판단
 *  iterator              :Iterator 객체를 반환(배열이 가지고 있는 모든 요소에 접근)
 */

public class ArrayListMain01 {
	
/*
 * 
 * ArrayList특징
 * ArrayList<E> : 가변 크기의 배열을 구현한 컬렉션 class
 *              : 동기화 지원 X => 사용자가 직접 구현
 *              : 객체 내부에 배열을 가지고 있다.
 *              : index로 각 요소에 접근 한다.
 * 
 */
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add(new StringBuilder("five").toString());
		
		list.add("one");  //중복 허용.
		//출력
		
		System.out.println("<1.index이용하여 출력>");
		for(int index = 0; index<list.size(); index++) {
			System.out.println(list.get(index));
		}
		
		System.out.println("===========================");
		
		System.out.println("<2.1.5버전 이후의 for문 사용>");
		for(String str : list) {
			System.out.println(str);
		}
		
		System.out.println("<3. toArray()사용>");  //고정 크기의 배열로 바꿔준다.
		Object[] arr = list.toArray();
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("<4. Iterator사용>");
		
		Iterator<String> ite = list.iterator();
		
		while(ite.hasNext()) {
			String str = ite.next();
			System.out.println(str);
		}
		
		System.out.println("================================");
		
		boolean bool = list.remove("one");
		System.out.println("\"one\" 삭제 여부 : " + bool);
		
		arr = list.toArray();
		System.out.println(Arrays.toString(arr));
		System.out.println("index 0번지 : " + list.get(0));
		
		bool = list.remove("one");
		arr = list.toArray();
		System.out.println(Arrays.toString(arr));
		
		String str = list.remove(0);
		System.out.println(str);
		arr = list.toArray();
		System.out.println(Arrays.toString(arr));
		
		// E remove(int i) => 삭제 후 삭세한 index의 data를 리턴.
		
		if(list.contains("three")) {
			System.out.println("존재");
		} else {
			System.out.println("없음");
		}
		
		
		list.clear();
		
		if(list.isEmpty()) {
			System.out.println("비어있음");
		} else {
			System.out.println("비어 있지 않음");
		}
		
		List<String> sub = new ArrayList<String>();
		
		sub.add("1");
		sub.add("2");
		sub.add("3");
//		
//		list.add("one");
//		list.add("two");
//		list.add("three");
		
		list.addAll(sub);
		for(int i = 0; i<list.size(); i++) {
			String str2 = list.get(i);
			System.out.println(str2);
		}
	}
}
