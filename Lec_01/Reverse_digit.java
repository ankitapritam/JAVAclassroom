package Lec_01;
import java.util.*;

public class Reverse_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int rem;
		int revdig = 0;
		while(number>0) {
			rem = number%10;
			System.out.println(rem);
			number = number/10;
			revdig = revdig*10 + rem;
		}
		System.out.println(revdig);
	}

}
