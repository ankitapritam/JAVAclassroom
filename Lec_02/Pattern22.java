package Lec_02;

public class Pattern22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		int row = 0;
		int tot_str = n;
		while(row<n) {
			int cnt_str=0;
			while(cnt_str<tot_str) {
				if(row==0 || row==n-1 || cnt_str==0 || cnt_str==n-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				cnt_str++;
			}
			System.out.println();
			row++;
		}
	}

}
