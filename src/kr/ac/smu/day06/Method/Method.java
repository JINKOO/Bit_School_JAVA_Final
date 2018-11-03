package kr.ac.smu.day06.Method;

/*
 * 
 * 메소드 오버로딩시
 * this키워드를 잘 쓰자.
 * 
 */
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Method {

	private Random r;
	private Scanner sc;
	private int[] arr;
	
	public Method() {
		this.r = new Random();
		this.sc = new Scanner(System.in);
	}
	
	public int scanInt() {
		System.out.println("정수 입력 >>> ");
		int num = Integer.parseInt(sc.nextLine());
		return num;
	}
	
	public int getSum(int num1, int num2) {
		int sum = 0;
		for(int i = num1; i <= num2; i++) {
			sum = sum + i;
		}
		return sum;
	}
	
	public void infoSum(int num1, int num2, int sum) {
		System.out.printf("%d ~ %d까지의 합 : %d", num1, num2, sum);
		System.out.println();
	}
	
	public int[] getArr() {
		arr = this.getArr(100, 10);
		return arr;
	}
	
	public int[] getArr(int size) {
		arr = this.getArr(100, size);
		return arr;
	}
	
	public int[] getArr(int max, int size) {
		arr = new int[size];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = r.nextInt(max) + 1;
		}
		return arr;
	}
	
	public void showArr(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}
}
