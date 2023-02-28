package lt.lhu.unit8.main;

public class task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double A = 1.0;
		double x1 = -2 * A;
		double dx = A / 5.0;
		double x;
		double y;
		double n = 5;
		int i;

		x = x1;
		for (i = 0; i <= n; i++) {
			if (x <= 0) {
				y = A / 2.0 * (Math.pow(Math.E, x / A) + Math.pow(Math.E, -x / A));
			} else {
				y = 4 * Math.pow(A, 3) / (x * x + 4 * Math.pow(A, 2));
			}
			System.out.printf("(%5.2f,%10.6f)\n", x, y);
			x = x + dx;
		}
	}
}
