package Lec_07;

public class SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,40};
		printSubArray(arr);
	}

	public static void printSubArray(int[] arr) {
		// TODO Auto-generated method stub
		for(int i = 0; i<arr.length;i++) {
			for(int j=i; j<arr.length;j++) {
				for(int z=i; z<=j; z++) {
					System.out.print(arr[z] + " ");
				}
				System.out.println();
			}
		}
		
	}

}
