public class IncDecOpExample {
	public static void main(String args[]) {
	int x, y;
	
	x = 2;
	y = 5;
	
	++x;
	System.out.println("x ����:" + x);
	
	--y;
	System.out.println("y ����:" + y);

	x = 2;
	y = x--;
	System.out.println("y ����:" + y);

	x = 2;
	y = --x;
	System.out.println("y ����:" + y);
	}
}
