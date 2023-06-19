package Lec_01;
import java.util.*;

public class Fibonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		int i = 0;
		int c = 0;
		while(i<n) {
			c = a+b;
			a = b;
			b = c;
			i++;
		}
		System.out.println(a);
	}

}
