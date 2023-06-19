package Lec_07;

public class ArrayRotation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,40,50};
		int nor = 13;
		arrRotation(arr,nor);
	}
	public static void arrRotation(int[] arr, int nor) {
		// TODO Auto-generated method stub
		nor = nor%arr.length;
		revPrint(arr,0, arr.length-1);
		revPrint(arr,0,nor-1);
		revPrint(arr,nor,arr.length-1);
		for(int a: arr) {
			System.out.print(a+ " ");
		}
		System.out.println();
		}
	public static void revPrint(int[] arr, int l, int r) {
		while(l<r) {
			int temp = arr[l];
			arr[l]=arr[r];
			arr[r]=temp;
			l++;
			r--;
		}
		//System.out.println();
	}
}
