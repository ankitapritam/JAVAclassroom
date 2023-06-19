package Lec_01;
import java.util.*;

public class Prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int nof = 0;
		int i = 1;
		while(i<=number) {
			if(number%i == 0) {
				System.out.println(i);
				nof++;
			}
			i++;
		}
		if(nof == 2) {
			System.out.println("The number is a prime number");
		}
		else {
			System.out.println("The number is not a prime number.");
		}
	}

}
