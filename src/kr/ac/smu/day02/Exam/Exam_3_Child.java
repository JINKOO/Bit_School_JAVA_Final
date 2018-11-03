package kr.ac.smu.day02.Exam;

public class Exam_3_Child extends Exam_3_Parent{
	
	private Exam_3_Process ep;
	
	public Exam_3_Child() {
		this.ep = new Exam_3_Process();
	}
	
//	public int[] scanInt() {
//		String[] arr = {"첫 번째 정수 입력 : ", "두 번째 정수 입력: "};
//		int[] nums = new int[arr.length];
//		for(int i = 0; i<arr.length; i++) {
//			if(i == 0) {
//				System.out.print(arr[i]);
//				nums[i] = ep.choice();
//			}
//			else {
//				System.out.print(arr[i]);
//				nums[i] = ep.choice();
//			}
//		}
//		return nums;
//	}
	
	@Override
	public void add(int num1, int num2) {
		System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
	}

	@Override
	public void sub(int num1, int num2) {
		System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
	}

	@Override
	public void mul(int num1, int num2) {
		System.out.println(num1 + "x" + num2 + "=" + (num1 * num2));
	}

	@Override
	public void div(int num1, int num2) {
		System.out.println(num1 + "/" + num2 + "=" + ((double)num1 / num2));
	}

	@Override
	public void check(int num1, int num2) {
		int[] nums = {num1, num2};
		boolean bool = false;
		for(int i = 0; i < nums.length; i++) {
			int count = 0;
			for(int j = 1; j <= nums[i]; j++) {
				if(nums[i] % j == 0) {
					count++;
				}
			}
			if(count == 2) {
				bool = true;
				System.out.println(nums[i] + "소수 여부 체크 : " + bool);
			} else {
				bool = false;
				System.out.println(nums[i] + "소수 여부 체크 : " + bool);	
			}
		}
	}
}
