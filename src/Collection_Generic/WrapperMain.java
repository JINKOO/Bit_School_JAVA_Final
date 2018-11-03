package Collection_Generic;

import java.util.LinkedList;
import java.util.List;

/*
 * 
 * WrapperClass
 * 기본 자료형을 참조 자료형으로 바꿔준다.
 * 
 * 
 */
public class WrapperMain {

	public static void main(String[] args) {
	
//		Object[] obj = new Object[5];
//		obj[0] = "오렌지";
//		obj[1] = new Integer(10);
//		obj[2] = 3.14;
//		obj[3] = true;
//		
//		for(int i = 0; i<obj.length; i++) {
//			System.out.println(obj[i]);
//		}
		
		String str = "123456";
		
		String str2 = Integer.toBinaryString(10);
		System.out.println(str2);
		int num = Integer.parseInt(str);
		System.out.println(num);
		
		int num2 = Integer.valueOf(str);
		System.out.println(num2);
		
		int i = 100;
		Integer i2 = new Integer(100);
		
		Integer i3 = 12;  //auto boxing
		
		int i4 = new Integer(100); //auto unboxing
		
		List<Integer> list = new LinkedList<Integer>();
		
		list.add(10);
		list.add(new Integer(100));
		
		for(Integer it: list) {
			System.out.println(it);
		}
		
		Integer i5 = list.get(0);
		int i6 = list.get(0);
	}
}
