package Lec_06;

public class Armst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printAllArmst(1000);
		//System.out.println(isArm(153));
	}

	public static void printAllArmst(int num) {
		// TODO Auto-generated method stub
		for(int n=1; n<num; n++) {
			if(isArm(n)) {
				System.out.println(n);
			}
		}
	}

	public static boolean isArm(int num) {
		// TODO Auto-generated method stub
		int number = num;
		int digit = numOfDigits(number);
		int sum=0;
		while(num>0) {
			int rem = num%10;
			sum = sum + (int)Math.pow(rem, digit);
			num=num/10;
		}
		if (sum==number) {
			return true;
		}
		else {
			return false;
		}
	}
	public static int numOfDigits(int num) {
		int digit=0;
		while(num>0) {
			num=num/10;
			digit++;
		}
		return digit;
	}

}
