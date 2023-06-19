package Lec_5;

public class DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float min = 0;
		float max = 100;
		float step = 20;
		//double c = 0;
		while(min<=max) {
			float c = (5/(float)9)*(min-32);
			System.out.println(min + "\t" + c);
			min+=step;
		}
		System.out.println((int)'9');
	}

}
