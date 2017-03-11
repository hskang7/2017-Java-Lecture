public class WhileExample {
	public static void main(String args[]) {
		int a = 1;
		int result = 0;

		while (a <= 10) {
			result += a;
			a++;
		}
		System.out.println("1부터 10까지의 합은 " + result);
	}
}
