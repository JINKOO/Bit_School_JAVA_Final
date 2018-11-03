package Array;

public abstract class ArrayType implements Array {
	
	public abstract int[] sortArr(int[] arr);
	public abstract int[] reverseArr(int[] arr);
	
	@Override
	public void show(int[] arr) {
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
