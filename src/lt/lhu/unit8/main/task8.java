package lt.lhu.unit8.main;

public class task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x;
		double y = 1;
		double hx = 0.1;

		for (x = 0.1; x <= 10; x = x + hx) {
			y = x * x - Math.pow(Math.E, 2 * x) + 4.0;
			if (y < 0) {
				break;
			}
			System.out.printf(" x =  %4.2f  y =  %4.2f \n", x, y);
		}
	}
}
