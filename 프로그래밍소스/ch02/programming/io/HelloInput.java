package programming.io;

public class HelloInput {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.println("�̸��� �й��� �Է��ϼ���.");
		String name = input.next();
		int num = input.nextInt();
		System.out.println("�̸�: " + name);		
		System.out.println("�й�: " + num);		
	}
}
