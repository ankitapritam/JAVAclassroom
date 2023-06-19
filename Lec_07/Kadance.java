package Lec_07;

public class Kadance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,5,-8,40,2,-41,70,5,-6,-50,1};
		System.out.println(solve(arr));
	}
	public static int solve(int[] arr) {
		int ans = 0; int sum = 0;
		for(int a : arr) {
			sum = sum+a;
			if(ans<sum) {
				ans=sum;
			}
			if(sum<0) {
				sum=0;
			}
		}
		return ans;
	}
}
