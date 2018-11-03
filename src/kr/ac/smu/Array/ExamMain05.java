package kr.ac.smu.Array;

import java.util.Random;

/*
 *  
 *
 1 - 99사이의 난수를 5개 추출하여 다음과 같이 출력

  < PRINT >
  25  9  36  84  70
  
  < REVERSE >
  7  48  63  90  52

*/

public class ExamMain05 {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		System.out.println("< PRINT >");
		
		int[] arr = new int[5];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = r.nextInt(100) + 1;
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		
		int temp;
		System.out.println("< REVERSE >");
		for(int i = 0; i<arr.length; i++) {
			for(int j = i; j<arr.length; j++) {
				if(j == arr.length-1-i) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		int n10;
		int n1;
		for(int i = 0; i < arr.length; i++) {
			n10 = arr[i] / 10;
			n1 = arr[i] % 10;
			System.out.print((n1*10) + n10 + " ");
		}
//		for(int i = arr.length - 1; i >= 0; i--) {
//			n10 = arr[i] / 10;
//			n1 = arr[i] % 10;
//			System.out.print((n1*10) + n10 + " ");
//		}
	}
}
