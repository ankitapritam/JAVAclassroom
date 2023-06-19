package Lec_02;
import java.util.*;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int j = 0;
		while(j<n) {
			int i = 0;
			while(i<n) {
				System.out.print("* ");
				i++;
			}
			System.out.println();
			j++;
		}
	}

}
