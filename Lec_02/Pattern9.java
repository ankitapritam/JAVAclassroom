package Lec_02;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 0;
		int total_str = 1;
		int space = n-1;
		while(row<n) {
			int cnt_str = 0;
			int sp_cnt = 0;
			while(sp_cnt<space) {
				System.out.print("  ");
				sp_cnt++;
			}
			
			while(cnt_str<total_str) {
				if(cnt_str%2==0) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				cnt_str++;
			}
			row++;
			System.out.println();
			total_str=total_str+2;
			space--;
		}
	}

}
