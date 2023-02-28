package lt.lhu.unit8.main;

public class task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 0.5;
		double y;
		double a = 0.50;
		double b = 1.0;
		double h = 0.05;
		int i = 1;

		System.out.println("-------------------------------------------------");
		System.out.printf("|%2s|\t%-10s\t|\t%-10s\t|\n", " ", "x", "y");
		System.out.println("-------------------------------------------------");

		for (x = a, i = 1; x <= b; x = x + h, i++) {
			y = Math.sqrt(Math.pow(Math.E, 2.2 * x)) - Math.abs(Math.sin(Math.PI * x / (x + 2.0 / 3.0))) + 1.7;
			System.out.printf("|%2d|\t%6.6f\t|\t%6.6f\t|\n", (int) i, x, y);
		}

		System.out.println("-------------------------------------------------");
	}

}
