package Lec_5;
import java.lang.Math;

public class Play_withInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12345;
		int n = num;
		int rot = 47;
		int nod = 0;
		while(num>0) {
			int rem = num%10;
			num = num/10;
			nod++;
		}
		int mult = (int)Math.pow(10,rot);
		int part1=n/mult;
		int part2=n%mult;
		
		int mult2=(int)Math.pow(10,nod-rot);
		int ans = part2*mult2 + part1;
		
		System.out.println(ans);

	}

}
