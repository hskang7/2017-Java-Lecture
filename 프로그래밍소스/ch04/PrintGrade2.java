
public class PrintGrade2 {
	public static void main(String args[]) {
		int point = 87;

		switch (point / 10) {
		case 10:
			System.out.println("������ A");
			break;
		case 9:
			System.out.println("������ B");
			break;
		case 8:
			System.out.println("������ C");
			break;
		default:
			System.out.println("������ F");
		}
	}
}
