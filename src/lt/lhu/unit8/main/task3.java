package lt.lhu.unit8.main;

public class task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 0.5;
		int n = 20;
		double k;
		double sum = 0;
		double y;

		for (k = 1; k <= n; k++) {
			sum = sum + (Math.sin((k * x) / 2.0) + Math.sin((k * x - 1) / 2.0)) / Math.pow(Math.E, x - 1.0 / k);
		}
		
		y = Math.sqrt(n * Math.PI) * sum;
		System.out.println(y);
	}

}
