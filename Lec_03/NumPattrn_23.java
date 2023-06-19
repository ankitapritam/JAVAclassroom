package Lec_03;

public class NumPattrn_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 0;
		int total_str = 1;
		int space = n-1;
		int num =1;
		while(row<n) {
			int cnt_str = 0;
			int sp_cnt = 0;
			while(sp_cnt<space) {
				System.out.print("\t");
				sp_cnt++;
			}
			
			while(cnt_str<total_str) {
				System.out.print(num+"\t");
				cnt_str++;
				num++;
			}
			row++;
			System.out.println();
			total_str=total_str+2;
			space--;
		}
	}

}
