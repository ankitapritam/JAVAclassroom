package Lec_5;
import java.lang.Math;

public class String_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(10+20+"Hello"+10+20);
		//System.out.println(10+"Hello"+10+20);
		//System.out.println(10+20+"Hello"+(10+20));
		
		
		int num = 12345;
		int n = num;
		int rot = 47;
		int nod = 0;
		while(num>0) {
			int rem = num%10;
			num = num/10;
			nod++;
		}
		int sum=0;
		//System.out.println(nod+" "+n);
		int mult = (int)Math.pow(10,nod-1);
		for(int i=0; i<rot%nod; i++) {
			int rem = n%10;
			n=n/10;
			sum=n+rem*mult;
			mult=mult/10;
		}
		System.out.println(sum);
	}

}
