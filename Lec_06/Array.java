package Lec_06;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		int j =1;
		System.out.println(arr.length);
		for(int i=0; i<arr.length; i++) {
			arr[i]=2*j;// 2*i+2;
			j++;
		}
		for(int i=0; i<arr.length;i++) {
			System.out.println("arr["+i+"]\t"+arr[i]);
		}//for(int ele : arr){System.out.println(ele);}
		
	}

}
