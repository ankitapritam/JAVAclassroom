package Lec_01;

public class Hcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int divisor = 14;
		int dividend = 38;
		int rem;
		while(divisor > 0) {
			rem = dividend%divisor;
			dividend = divisor;
			divisor = rem;
		}
		System.out.println("HCF is "+ dividend);
	}

}
