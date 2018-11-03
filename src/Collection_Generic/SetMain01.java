package Collection_Generic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 * 
 *  Set : �ߺ�(X), ����(X)
 * 
 * 
 */
public class SetMain01 {

	public static void main(String[] args) {
		
		Set<String> set1 = new HashSet<>();  //���ĵ� ���·� ������ �ʴ´�.
		Set<String> set2 = new TreeSet<>();  //���ĵ� ���·�(������)
		
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
		
		System.out.println("�Է��� data�� ���� : " + set2.size() + "��");
		
		boolean bool = set2.add("one");
		System.out.println("\'one\' �Է� : " + (bool ? "���� ����" : "����"));
		
		set2.add("two");
		set2.add("three");
		set2.add("four");
		set2.add("five");
		
		//�ߺ� �� data�� ������ ���� ���ϰ� ƨ�ܳ���.
		bool = set2.add("one");
		System.out.println("\'one\' �Է� : " + (bool ? "���� ����" : "����"));
		
		System.out.println("�Է� �� data�� ���� : " + set2.size() + "��");
		
		
		/*
		 * Set ��ü ������ ���.
		 * (Set�� index����� �ƴϴ�.(������ ����.)/index�� ���� �Ұ� �ϴ�)
		 * 1. 1.5���������� for��
		 * 2. Iterator���.
		 * 3. toArray()���.
		 * 
		 */
		
		System.out.println();
		System.out.println("<<1.5���� for��>>");
		//�츮�� �Է��� ���´�� ������ �ʰ� treeSet�̱� ������ ���������� ���´�.
		for(String str : set2) {
			System.out.println(str);
		}
		
		System.out.println("<<Iterator ���>>");
		Iterator<String> ite = set2.iterator();
		while(ite.hasNext()) {
			String str = ite.next();
			System.out.println(str);
		}
		
		System.out.println("<<toArray() ���>>");
		Object[] objarr = set2.toArray();
		System.out.println(Arrays.toString(objarr));
		
	}
}
