package Lec_5;

public class functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		my_newFun();
		int a = add(10,5,7);
		System.out.println(a);

	}
	public static void my_newFun() {
		System.out.println("Hey, I did it!!");
	}
	public static int add(int a, int b,int c) {
		return a+b+c;
	}

}
