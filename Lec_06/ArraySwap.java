package Lec_06;

public class ArraySwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {23,12,14,7};
		System.out.println(arr1[0] + " " +arr2[0]);
		swap(arr1[0],arr2[0]);
		swap_in(arr1,arr2,0);
		System.out.println(arr1[0]+ " " + arr2[0]);
	}

	public static void swap(int i, int j) {
		// TODO Auto-generated method stub
		int x = i;
		i = j;
		j = x;
		System.out.println(i+ " " + j);
	}
	public static void swap_in(int[] i, int[] j,int c) {
		// TODO Auto-generated method stub
		int x = i[c];
		i[c] = j[c];
		j[c] = x;
		System.out.println(i[c]+ " " + j[c]);
	}

}
