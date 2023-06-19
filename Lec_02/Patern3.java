package Lec_02;

public class Patern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 0;
		int total_str=n;
		while(row<=n) {
			int cnt_str = 0;
			while(cnt_str<=total_str) {
				System.out.print("* ");
				cnt_str++;
			}
			System.out.println("");
			row++;
			total_str--;
		}
	}

}
