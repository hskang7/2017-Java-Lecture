public class PrintGrade {
	public static void main(String args[]) {
		int point = 87;

		if (point >= 90)
			System.out.println("������ A+");
		else if (point >= 85)
			System.out.println("������ A0");
		else if (point >= 80)
			System.out.println("������ B+");
		else if (point >= 75)
			System.out.println("������ B0");
		else if (point >= 70)
			System.out.println("������ C+");
		else if (point >= 65)
			System.out.println("������ C0");
		else
			System.out.println("������ F");
	}
}
