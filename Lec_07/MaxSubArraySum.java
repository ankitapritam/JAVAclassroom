package Lec_07;

public class MaxSubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,40};
		//maxSubArray(arr);
		maxSubArray2(arr);
	}
	public static void maxSubArray(int[] arr) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i<arr.length;i++) {
			
			for(int j=i; j<arr.length;j++) {
				int sum = 0;
				for(int z=i; z<=j; z++) {
					System.out.print(arr[z] + " ");
					sum = sum + arr[z];
				}
				System.out.println(sum);
			}
		}
		
	}
	public static void maxSubArray2(int[] arr) {
		// TODO Auto-generated method stub
		int ans = 0;
		for(int i = 0; i<arr.length;i++) {
			int sum = 0;
			for(int j=i; j<arr.length;j++) {
				sum = sum + arr[j];
				//System.out.println(sum);
				if(ans<sum) {
					ans = sum;
				}
			}
		}
		System.out.println(ans);
		
	}
	
}
