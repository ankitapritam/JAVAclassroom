package Lec_02;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int r = 0;
		int t_sp=0;
		int t_str=n;
		while(r<n) {
			int cnt_sp=0;
			int cnt_str=0;
			while(cnt_sp<t_sp) {
				System.out.print("   ");
				cnt_sp++;
			}
			while(cnt_str<t_str) {
				System.out.print(" *");
				cnt_str++;
			}
			r++;
			t_str--;
			t_sp++;
			System.out.println();
		}
	}

}
