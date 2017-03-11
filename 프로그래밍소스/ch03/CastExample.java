class CastExample {
	public static void main(String[] args) {
	byte b;
	int i = 495;
	double d = 342.23;
	
	System.out.println("축소 형변환 결과");
	b = (byte)i;
	System.out.println("int형 495를 byte로 하면: " + b);
	
	i = (byte)d;
	System.out.println("double형 342.23 int로 하면: " + i);
	
	b = (byte)d;
	System.out.println("double형 342.23을 byte로 하면: " + b);
	}
}