package Lec_07;

public class ArrayReverseAtSameAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,40,50};
		printReverse(arr);
		int ele = 90 ;
		int ant = findIndexElement(arr,ele);
		if(ant>=0) {
			System.out.println(ant);
		}
		else {
			System.out.println("Not Found");
		}
	}

	public static int findIndexElement(int[] arr, int ele) {
		// TODO Auto-generated method stub
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==ele) {
				return i;
			}
		}
		return -1;
	}

	private static void printReverse(int[] arr) {
		// TODO Auto-generated method stub
		int l = 0;
		int r = arr.length-1;
		while(l<r) {
			int temp = arr[l];
			arr[l]=arr[r];
			arr[r]=temp;
			l++;
			r--;
		}
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		for(int i =0; i<arr.length; i++) {
			System.out.print(i+"\t");
		}
		System.out.println();
	}

}
