package Lec_01;
import java.util.Scanner;

public class Lec01_hw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int i = 1;
		int sum = 0;
		while(i<=n) {
			System.out.println(i);
			sum = sum +i;
			i++;
		}
		System.out.println(sum);
	}

}
