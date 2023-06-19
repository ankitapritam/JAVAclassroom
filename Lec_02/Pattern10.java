package Lec_02;

public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int r = 0;
		int t_str = 1;
		while(r<2*n-1) {
			int cnt_str=0;
			while(cnt_str<t_str) {
				System.out.print("* ");
				cnt_str++;
			}
			r++;
			System.out.println();
			if(r<n) {
				t_str++;
			}
			else {
				t_str--;
			}
			
		}
	}

}
