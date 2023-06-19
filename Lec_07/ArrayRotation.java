package Lec_07;

public class ArrayRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,40,50};
		int nor = 13;
		arrRotation(arr,nor);
	}

	public static void arrRotation(int[] arr, int nor) {
		// TODO Auto-generated method stub
		int digit = nor%arr.length;
		for(int i = 0; i<digit; i++) {
			int r = arr.length-1;
			int l = arr.length-2;
			int z = arr[r];
			while(l>=0) {
				arr[r]=arr[l];
				l--;
				r--;
			}
			arr[0]=z;
		}
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]+ " ");
		}
		System.out.println();
	}

}
