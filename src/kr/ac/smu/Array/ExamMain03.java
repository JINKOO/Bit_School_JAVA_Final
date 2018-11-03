package kr.ac.smu.Array;
import java.util.Arrays;

import java.util.Random;

public class ExamMain03 {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		int[] arr = new int[10];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = r.nextInt(10) + 1;
		}
		
		System.out.println(Arrays.toString(arr));
		int temp;
		for(int i = 0; i<arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
