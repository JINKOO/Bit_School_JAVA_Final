package kr.ac.smu.Array;

import java.util.Arrays;
import java.util.Random;
/*
 * 
 * 
 * 
 * 2���� �迭�� �����ϰ�
 * ������ ��ġ8���� 
 * ������ ���ڸ� �������
 * �������� 0����
 * 
 * 
 * 
 */
public class ExamMain04 {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		int[][] arr = new int[4][4];
		int count = 0;
		
		while(count < 8) {
			int x = r.nextInt(4);
			int y = r.nextInt(4);
			
			if(arr[x][y] == 0) {
				arr[x][y] = r.nextInt(10) + 1;
				count++;
			}
		}
		
		for(int i = 0; i<arr.length; i++) {
			for(int num : arr[i]) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}
}
