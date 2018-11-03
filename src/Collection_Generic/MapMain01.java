package Collection_Generic;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * Collection �� �ٸ� interface�̴�.
 * 
 * Map : key , value ������ �̷���� ����
 * 
 * -���� (X), key(�ߺ� X), value(�ߺ�O)
 * 
 *  ���� class 
 *  -HashMap
 *  -TreeMap
 * 
 * 
 * �ֿ� �޼ҵ�
 * put(k,v)    :data�Է�
 * putAll(Map) :Map�� data�� ��ü �Է�. list�� addAll�� ���� ��,
 * get(k)      :�ش� key�� �ش��ϴ� value��ȯ.
 * remove(k)   :�ش� key�� �ش��ϴ� value��ȸ.
 * containsKey(k) : Ư�� key�� �ֳ� �Ǵ�.
 * entrySet() : 
 * 
 * 
 * �׻� key�� �����̴�.
 */

public class MapMain01 {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		
		System.out.println("�Է� �� data�� ���� : " + map.size());
		
		//Map�� data�Է� �ϱ�.
		map.put("aaa", "1234");
		map.put("bbb", "2345");
		map.put("ccc", "4567");
		
		System.out.println("�Է� �� data�� ���� : " + map.size());
		
		//key�� �ߺ� ���� �Ǵ�.
		String str = map.get("aaa");
		System.out.println(str);
		map.put("aaa", "1111");
		System.out.println(map.get("aaa")); //���������.
		System.out.println("�Է� �� data�� ���� : " + map.size());
		
		
		//data���.
		
		//���1. =>keySet()�̿�.
		
		Set<String> keys = map.keySet();
		for(String s : keys) {
			System.out.println("Keys : " + s + ", Value : " + map.get(s));
		}
		
		System.out.println("======================================");
		
		//���2. =>entrySet() �̿�.
		
		Set<Entry<String, String>> entry = map.entrySet();
		for(Entry<String, String> e : entry) {
			System.out.println("Keys : " + e.getKey() + ", Value : " + e.getValue());
		}
	}
}
