package lt.lhu.unit8.main;

import java.util.Random;

public class task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x;
		double y;
		
		int n = 2000;
		Random rand = new Random();
		int sum = 0;
		int i = 0;
		
		while (i < n) {
			x = rand.nextDouble(-5, 5);
			y = rand.nextDouble(-5, 5);

			if (((x <= 0 & x >= -2) & (y >= 0 & y <= 2)) | ((x >= 0 & x <= 2) & (y <= 1 & y >= -1))) {
				sum++;
			}
			i++;
		}
		System.out.print(sum);
	}

}
