class CastExample {
	public static void main(String[] args) {
	byte b;
	int i = 495;
	double d = 342.23;
	
	System.out.println("��� ����ȯ ���");
	b = (byte)i;
	System.out.println("int�� 495�� byte�� �ϸ�: " + b);
	
	i = (byte)d;
	System.out.println("double�� 342.23 int�� �ϸ�: " + i);
	
	b = (byte)d;
	System.out.println("double�� 342.23�� byte�� �ϸ�: " + b);
	}
}