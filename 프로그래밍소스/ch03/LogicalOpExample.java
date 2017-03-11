public class LogicalOpExample {
	public static void main(String args[]) {
		boolean x, y, z;
		x = (2 > 5) && (10 > 2);
		y = (2 < 5) || (10 < 2);
		z = !(2 < 5);
		
		System.out.println("x 값은: " + x);
		System.out.println("y 값은: " + y);
		System.out.println("z 값은: " + z);
		}
}
