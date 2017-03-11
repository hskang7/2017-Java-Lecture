public class DoWhileExample {
	public static void main(String args[]) {
		int a = 1;
		int result = 0;

		do {
			result += a;
			a++;
		} while (a <= 10);
		System.out.println("1부터 10까지의 합은 " + result);
	}
}
