public class PrintMax {
	public static void main(String args[]) {
		int x = 10, y = 20, z;
		z = y;
		if (x > y)
			z = x;
		System.out.println("x  값은: " + x);
		System.out.println("y  값은: " + y);
		System.out.println("x 와 y 중 큰 값은: " + z);
	}
}
