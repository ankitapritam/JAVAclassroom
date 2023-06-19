package Lec_5;
import java.util.Scanner;
import java.utli.*;

public class Char_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//char c = '!';
		char c = sc.next().charAt(0);
		//System.out.println((int)c);
		if(c>=65 && c<=90) //(c>='A' && c<='Z')
			{
			System.out.println("Upper");
		}
		else if(c>=97 && c<=122) //(c>='a' && c<='z')
			{
			System.out.println("Lower");
		}
		else {
			System.out.println("Pta nhi");
		}
		
	}

}
