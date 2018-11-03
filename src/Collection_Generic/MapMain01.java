package Collection_Generic;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * Collection 과 다른 interface이다.
 * 
 * Map : key , value 쌍으로 이루어진 집합
 * 
 * -순서 (X), key(중복 X), value(중복O)
 * 
 *  구현 class 
 *  -HashMap
 *  -TreeMap
 * 
 * 
 * 주요 메소드
 * put(k,v)    :data입력
 * putAll(Map) :Map에 data를 전체 입력. list의 addAll과 같은 것,
 * get(k)      :해당 key에 해당하는 value반환.
 * remove(k)   :해당 key에 해당하는 value조회.
 * containsKey(k) : 특정 key가 있나 판단.
 * entrySet() : 
 * 
 * 
 * 항상 key가 기준이다.
 */

public class MapMain01 {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		
		System.out.println("입력 전 data의 개수 : " + map.size());
		
		//Map에 data입력 하기.
		map.put("aaa", "1234");
		map.put("bbb", "2345");
		map.put("ccc", "4567");
		
		System.out.println("입력 후 data의 개수 : " + map.size());
		
		//key값 중복 유뮤 판단.
		String str = map.get("aaa");
		System.out.println(str);
		map.put("aaa", "1111");
		System.out.println(map.get("aaa")); //덮어씌어진다.
		System.out.println("입력 후 data의 개수 : " + map.size());
		
		
		//data출력.
		
		//방법1. =>keySet()이용.
		
		Set<String> keys = map.keySet();
		for(String s : keys) {
			System.out.println("Keys : " + s + ", Value : " + map.get(s));
		}
		
		System.out.println("======================================");
		
		//방법2. =>entrySet() 이용.
		
		Set<Entry<String, String>> entry = map.entrySet();
		for(Entry<String, String> e : entry) {
			System.out.println("Keys : " + e.getKey() + ", Value : " + e.getValue());
		}
	}
}
