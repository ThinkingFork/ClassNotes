public class Timing {
	public static void main(String[] args) {

		long start = System.currentTimeMillis();
		var result = generateArray(100000);
		long end = System.currentTimeMillis();

		System.out.printf("It took %d ms\n", end - start);
	}

	public static double[] generateArray(int howMany) {
		double[] data = new double[howMany];

		for (int i = 0; i < howMany; i++) {
			data[i] = Math.random();
		}
		return data;
	}

}
