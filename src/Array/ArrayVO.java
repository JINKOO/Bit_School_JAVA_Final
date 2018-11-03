package Array;

import java.util.Random;

public class ArrayVO extends ArrayType {

	private Random r;
	private int[] arr;
	
	public ArrayVO() {
		this.r = new Random();
		this.arr = new int[5];
	}
	
	public int[] sortArr(int[] arr) {
		int temp;
		for(int i = 0; i<arr.length; i++) {
			for(int j = i; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	
	public int[] reverseArr(int[] arr) {
		int temp;
		for(int i = 0; i<arr.length; i++) {
			for(int j = i; j<arr.length; j++) {
				if(j == arr.length-1-i) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

}
