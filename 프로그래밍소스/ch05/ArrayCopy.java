public class ArrayCopy {

	public static void main(String[] args) {

		int[] smallPrimes = {2, 3, 5, 7, 11, 13};
		int[] bigInts = {1001, 1002, 1003, 1004, 1005, 1006, 1007};

		for(int i = 0; i < smallPrimes.length; i++) {
			System.out.println("smallPrimes[" + i + "] = " + smallPrimes[i]);
		}
		for(int i = 0; i < bigInts.length; i++) {
			System.out.println("bigInts[" + i + "] = " + bigInts[i]);
		}

		System.arraycopy(smallPrimes, 2, bigInts, 3, 4);

		System.out.println();
		System.out.println("System.arraycopy(samllPrimes, 2, bigInts, 3, 4) 후의 결과는");
		for(int i=0; i<bigInts.length; i++) {
			System.out.println("bigInts[" + i + "] = " + bigInts[i]);
		}
	}
}
