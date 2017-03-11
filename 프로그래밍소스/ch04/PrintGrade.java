public class PrintGrade {
	public static void main(String args[]) {
		int point = 87;

		if (point >= 90)
			System.out.println("己利篮 A+");
		else if (point >= 85)
			System.out.println("己利篮 A0");
		else if (point >= 80)
			System.out.println("己利篮 B+");
		else if (point >= 75)
			System.out.println("己利篮 B0");
		else if (point >= 70)
			System.out.println("己利篮 C+");
		else if (point >= 65)
			System.out.println("己利篮 C0");
		else
			System.out.println("己利篮 F");
	}
}
