public class LogicalOpExample {
	public static void main(String args[]) {
		boolean x, y, z;
		x = (2 > 5) && (10 > 2);
		y = (2 < 5) || (10 < 2);
		z = !(2 < 5);
		
		System.out.println("x ����: " + x);
		System.out.println("y ����: " + y);
		System.out.println("z ����: " + z);
		}
}
