package Lec_02;
import java.util.*;

public class Prime_PRints_n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 2;
        
        
        while(num<=n){
            int nof = 0;
            int i = 1;
            while(i<=num){
                if(num%i==0){
                    nof++;
                }
                i++;
            }
            if(nof==2){
                System.out.println(num);
            }
            num++;
        }
	}

}
