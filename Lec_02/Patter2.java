package Lec_02;

public class Patter2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 0;
		int total_star;
		while(row<n) {
			int cnt_str = 0;
			total_star = row;
			while(cnt_str<=total_star) {
				System.out.print("* ");
				cnt_str++;
			}
			row++;
			System.out.println();
		}
	}

}
