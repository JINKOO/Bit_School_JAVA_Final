package kr.ac.smu.Array;
import java.util.Arrays;
import java.util.Scanner;

/*
 * 
 * 0보다 큰 임의의 정수를 입력 받고
 * 이 정수를 2진수로 출력하고
 * 1의 개수를 구하라.
 * 
 */
public class ExamMain02 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나를 입력하세요 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		int[] arr = new int[10];
		int count1 = 0;
		int count2 = 0;
		
		//2진수를 구하는 코드.
		for(int i = arr.length-1; i >= 0 && num > 0; i--) {
			arr[i] = num % 2;
			if(arr[i] == 1) {
				count1++;
			}
			num = num / 2;
		}
		
		System.out.println(Arrays.toString(arr));
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == 1) {
				break;
			}
			count2++;
		}
		
		for(int i = count2; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("1의 개수 : " + count1);
	}
}
