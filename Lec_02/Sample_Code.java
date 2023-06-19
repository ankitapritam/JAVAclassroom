package Lec_02;
import java.util.*;

public class Sample_Code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 2;
        int j = 1;
        int nof = 0;
        int cnt =0;
        while(cnt<=n){
        while(j<=n){
            if(i%j!=0){
                nof++;
            }
            j++;
        }
        
        if(nof == 2){
            System.out.println(i);
        }
        i++;
        cnt++;
        }
	}

}
