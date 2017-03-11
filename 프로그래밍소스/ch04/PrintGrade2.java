
public class PrintGrade2 {
	public static void main(String args[]) {
		int point = 87;

		switch (point / 10) {
		case 10:
			System.out.println("己利篮 A");
			break;
		case 9:
			System.out.println("己利篮 B");
			break;
		case 8:
			System.out.println("己利篮 C");
			break;
		default:
			System.out.println("己利篮 F");
		}
	}
}
