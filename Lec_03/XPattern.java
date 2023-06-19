package Lec_03;

public class XPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 1;
		int n = 5;
		int tot_str=n;
		while(row<=n) {
			int cnt_str=0;
			while(cnt_str<tot_str) {
				if(cnt_str+1==row || row+cnt_str==n) {
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
