package Lec_06;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		int[] arr2 = arr;
		arr2[0]=10;
		System.out.println(arr[0]);
		System.out.println(arr2[0]);
	}

}
