package kr.ac.smu.Array;

import java.util.Arrays;
import java.util.Random;

public class ExamMain01 {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		int[] arr = new int[5];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = r.nextInt(10) + 1;
		}
		
		//출력방법 3가지.
		
		System.out.println("<1.Index를 이용한 출력 >");
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("<2.1.5버전 이후의for문>");
		for(int num : arr) {
			System.out.print(num + " ");
		}
		
		System.out.println();
		System.out.println("<3.Arrays.toString함수 이용>");
		System.out.println(Arrays.toString(arr));
		
	}
}
