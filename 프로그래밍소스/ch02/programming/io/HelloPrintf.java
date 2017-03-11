package programming.io;

public class HelloPrintf {
	public static void main(String[] args) {
		byte age = 27;
		int income = 2000000;
		
		System.out.printf("나이: %d, 수입: %d, ", age, income);
		System.out.printf("%s: %c 형", "혈액형", 'O');
		System.out.println();
		System.out.format("%4d %4o %4h %n", 10, 10, 10);
		System.out.format("%-4d %-4o %-4x %n", 20, 20, 20);
		System.out.format("%+4d %4o %4H %n", 30, 30, 30);
		System.out.format("%1$4d %1$4o %1$4h %n", 128);
		System.out.printf("%1$6.2f %1$6.3f %1$6.4f %n", 3.141592);
	}
}
