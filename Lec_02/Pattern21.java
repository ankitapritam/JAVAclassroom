package Lec_02;
import java.util.*;

public class Pattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 0;
		int tot_str=0;
		int tot_str2 = 0;
		int tot_sp = 2*n-3;
		while(row<n) {
			int cnt_str = 0;
			int cnt_str2 = 0;
			int cnt_sp = 0;
			while(cnt_str<=tot_str2) {
				System.out.print("* ");
				cnt_str++;
			}
			while(cnt_sp<tot_sp) {
				System.out.print("  ");
				cnt_sp++;
			}
			if(row==n-1) {
				cnt_str2=1;
			}
			while(cnt_str2<=tot_str2) {
				System.out.print("* ");
				cnt_str2++;
			}
			System.out.println();
			row++;
			tot_str++;
			tot_str2++;
			tot_sp=tot_sp-2;
		}
	}

}
