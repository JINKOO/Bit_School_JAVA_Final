package Collection_Generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListMain02 {

	public static void show(List<String> list) {
		
		Iterator<String> ite = list.iterator();
		while(ite.hasNext()) {
			System.out.println("���� �� : " + ite.next());
		}
	}
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		if(list.isEmpty()) {
			List<String> subList = new ArrayList<String>();
			subList.add("�ڷᱸ��");
			subList.add("���������");
			subList.add("�ڿ������� ����");
			
			list.addAll(subList);
		}
		
		
		ArrayListMain02.show(list);
		System.out.println(list.size());
		System.out.println("====================================");
		
		if(list.contains("�ڷᱸ��")) {
//			int i = list.indexOf("�ڷᱸ��");
//			String str = list.remove(i);
//			System.out.println("������ ���� : " + str);
//			ArrayListMain02.show(list);
			
			boolean bool = list.remove("�ڷᱸ��");
			ArrayListMain02.show(list);
			System.out.println(list.size());
		}
	}
}
