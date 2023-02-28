package lt.lhu.unit8.main;

public class task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 3 * Math.pow(10, 3);
		double b = 6 * Math.pow(10, 4);
		double m = 4.0;

		double t1 = Math.sqrt(a + b + m);
		double t2 = m * Math.sqrt(a + b);
		double t3 = Math.sqrt(a * b * m);
		double t4 = m * Math.sqrt(a * b);

		double y;
		int sum = 0;
		int k;
		int i = 1;
		
		for (k = -30; k < 60 & i<= 20; i++) {
			y = k * k * k - 25 * k * k + 50 * k + 1000;
			k++;
			if (y > t1 & y < t2) {
				System.out.println(y);
			} else if (y > t3 & y < t4) {
				System.out.println("----" + y);
			} else {
				sum++;
			}
		}
		System.out.println("Остальных значений " + sum);
	}

}
