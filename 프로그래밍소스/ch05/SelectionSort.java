public class SelectionSort {

	public static void main(String[] args) {

		int cntElement = args.length;

		if(cntElement == 0) {
			System.out.println("실행을 잘못하셨습니다. ");
			System.out.println("실행 시 명령행 인자를 정수 형태로 입력해 주세요.");
			System.exit(0);
		}
		
		int input[] = new int[cntElement];

		System.out.print("정렬하기 위한 입력 값 ==> ");
		for(int i = 0; i < cntElement; i++) {
			input[i] = Integer.parseInt(args[i]);
			System.out.print(input[i] + " ");
		}
		System.out.println('\n');

		int start = 0;
		while (start < cntElement-1)	{
			int minIndex = start;

			for(int i = start+1; i < cntElement; i++) {
				if(input[minIndex] > input[i]) {
					minIndex = i;
				}
			}

			if(minIndex != start) {
				int dummy;

				dummy = input[start];
				input[start] = input[minIndex];
				input[minIndex] = dummy;
			}
			start++;
		}

		System.out.print("정렬의 결과는 ==> ");
		for(int i = 0; i < cntElement; i++) {
			System.out.print(input[i] + " ");
		}
		System.out.println();
	}
}
