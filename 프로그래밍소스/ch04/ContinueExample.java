public class ContinueExample {
	public static void main(String args[]) {
int i, result = 0;

for( i = 1 ; i <= 100; i++) {
		if(i % 2 == 0) {
			continue;			
		}
		result += i;
			System.out.println(i + "\t");

		if(result >= 100)
				break;
		}
		System.out.println("���� �հ��:"  + result);
	}
}
