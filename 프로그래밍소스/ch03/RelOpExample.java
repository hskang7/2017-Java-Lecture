public class RelOpExample {
	public static void main(String args[]) {
		int x = 3, y = 5, z = 3;
		boolean ret;
		ret = x > y;
		System.out.println("x > y ��" + ret);
		
		ret = x * y < y + z;
		System.out.println("x * y < y + z��" + ret);
		ret = x * y == y * z;
		System.out.println("x * y == y * z��" + ret);
		}
}
