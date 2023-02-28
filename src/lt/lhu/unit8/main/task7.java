package lt.lhu.unit8.main;

public class task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double y;
		double x = 10.0;
		double hx = 1.5;
		double z = 5.0;
		double hz = 0.9;

		int i = 0;
		int j = 0;
		System.out.println("-------------------------------------------------");
		System.out.printf("|\t%-4s\t|\t%-4s\t|\t%-4s\t|\n", "x", "z", "y");
		System.out.println("-------------------------------------------------");

		x = 10.0;
		for (i = 0; i < 3; i++) {
			System.out.printf("|\t%-4.1f\t|\t%-4s\t|\t%-4s\t|\n", x, " ", " ");
			z = 4.0;
			for (j = 0; j < 5; j++) {
				y = Math.sqrt(z * z + x * x) * Math.log(z) + Math.abs(Math.log(z)) / Math.sqrt(x * x - z * z + 3.2);
				System.out.printf("|\t%-4s\t|\t%-4.1f\t|\t%-5.2f\t|\n", " ", z, y);
				z = hz + z;
			}
			x = hx + x;
		}
		System.out.println("-------------------------------------------------");
	}

}
