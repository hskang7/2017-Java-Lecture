public class IncDecOpExample {
	public static void main(String args[]) {
	int x, y;
	
	x = 2;
	y = 5;
	
	++x;
	System.out.println("x 값은:" + x);
	
	--y;
	System.out.println("y 값은:" + y);

	x = 2;
	y = x--;
	System.out.println("y 값은:" + y);

	x = 2;
	y = --x;
	System.out.println("y 값은:" + y);
	}
}
