package Lec_03;

public class ForLoopQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int row = 0;
		int tot_str=n/2;
		int tot_str2=n/2;
		int tot_sp=0;
		while(row<n) {
			int cnt_str = 0;
			while(cnt_str<tot_str) {
				System.out.print("*  ");
				cnt_str++;
			}
			int cnt_sp = 0;
			while(cnt_sp<=tot_sp) {
				System.out.print("   ");
				cnt_sp++;
			}
			int cnt_str2 = 0;
			while(cnt_str2<tot_str2) {
				System.out.print("*  ");
				cnt_str2++;
			}
			System.out.println();
			row++;
			if(row>n/2) {
				tot_str++;
				tot_sp-=2;
				tot_str2++;
			}
			else {
				tot_str--;
				tot_sp+=2;
				tot_str2--;
			}
		}
	}

}
