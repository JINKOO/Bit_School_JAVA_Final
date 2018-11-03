package Collection_Generic;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*
 * 
 * List Ư¡ : ���� ��� �� // �ߺ� ��� ��
 * 
 * List<E>
 * ���� class : 1.Vector 2. ArrayList 3.LinkedList
 * 
 * �޼ҵ�
 *  
 *  add(E e)         : data �Է�
 *  addAll(List l)   : ����Ʈ�� ���������� �Է�
 *  get(int i)       : ����Ʈ�� ������ ������ ����
 *  E remove(int i)  : �ش� index������ ���� / ���ϰ� : ������ data
 *  boolean remove(E e) : �ش� data���� / ���ϰ� : ���� ����
 *  clear()             :��ü data ����
 *  size()              :����Ʈ�� ��ü data ����
 *  boolean contains(E e) : �ش� data�������� �Ǵ�
 *  boolean isEmpty()     :����Ʈ�� ����ִ��� �Ǵ�
 *  iterator              :Iterator ��ü�� ��ȯ(�迭�� ������ �ִ� ��� ��ҿ� ����)
 */

public class ArrayListMain01 {
	
/*
 * 
 * ArrayListƯ¡
 * ArrayList<E> : ���� ũ���� �迭�� ������ �÷��� class
 *              : ����ȭ ���� X => ����ڰ� ���� ����
 *              : ��ü ���ο� �迭�� ������ �ִ�.
 *              : index�� �� ��ҿ� ���� �Ѵ�.
 * 
 */
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add(new StringBuilder("five").toString());
		
		list.add("one");  //�ߺ� ���.
		//���
		
		System.out.println("<1.index�̿��Ͽ� ���>");
		for(int index = 0; index<list.size(); index++) {
			System.out.println(list.get(index));
		}
		
		System.out.println("===========================");
		
		System.out.println("<2.1.5���� ������ for�� ���>");
		for(String str : list) {
			System.out.println(str);
		}
		
		System.out.println("<3. toArray()���>");  //���� ũ���� �迭�� �ٲ��ش�.
		Object[] arr = list.toArray();
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("<4. Iterator���>");
		
		Iterator<String> ite = list.iterator();
		
		while(ite.hasNext()) {
			String str = ite.next();
			System.out.println(str);
		}
		
		System.out.println("================================");
		
		boolean bool = list.remove("one");
		System.out.println("\"one\" ���� ���� : " + bool);
		
		arr = list.toArray();
		System.out.println(Arrays.toString(arr));
		System.out.println("index 0���� : " + list.get(0));
		
		bool = list.remove("one");
		arr = list.toArray();
		System.out.println(Arrays.toString(arr));
		
		String str = list.remove(0);
		System.out.println(str);
		arr = list.toArray();
		System.out.println(Arrays.toString(arr));
		
		// E remove(int i) => ���� �� �輼�� index�� data�� ����.
		
		if(list.contains("three")) {
			System.out.println("����");
		} else {
			System.out.println("����");
		}
		
		
		list.clear();
		
		if(list.isEmpty()) {
			System.out.println("�������");
		} else {
			System.out.println("��� ���� ����");
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
