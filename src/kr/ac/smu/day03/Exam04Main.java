package kr.ac.smu.day03;

/*
 * 
 *  *
 *  **
 *  ***
 *  ****
 *  *****
 *  ****
 *  ***
 *  **
 *  *
 */
public class Exam04Main {
	
	public static void main(String[] args) {
		
		for(int i = 0; i<9; i++) {
			for(int j = 0; j<=i; j++) {
				if(i <= 4 && i >= j)
					System.out.print("*");
				if(i > 4 && i < 9-j) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
