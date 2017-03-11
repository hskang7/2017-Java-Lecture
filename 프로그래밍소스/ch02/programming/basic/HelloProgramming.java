package programming.basic;

public class HelloProgramming {

	//필드 선언
	static String fd = " -- 필드";
	static String md = " -- 메소드";
	
	//자바 프로그램을 실행하는 main() 메소드 구현 
	public static void main(String[] args) {
		System.out.println("자바 클래스의 구조");
		write(fd);
		write(md);
	}

	//프로그래머가 정의하는 메소드 write()의 구현
	public static void write(String word) {
		System.out.println(word);
	}
}
