package Lec_06;

public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,88,30,99,50};
		traverseArray(arr);
		revPrint(arr);
		System.out.println(maxArray(arr));
	}
	public static void traverseArray(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static int maxArray(int[] arr) {
		// TODO Auto-generated method stub
		int max = Integer.MIN_VALUE;
		for(int i = 0; i< arr.length; i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println();
		return max;
		
	}
	public static void revPrint(int[] arr) {
		for(int i=arr.length-1; i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
