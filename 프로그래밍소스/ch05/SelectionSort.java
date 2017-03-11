public class SelectionSort {

	public static void main(String[] args) {

		int cntElement = args.length;

		if(cntElement == 0) {
			System.out.println("������ �߸��ϼ̽��ϴ�. ");
			System.out.println("���� �� ����� ���ڸ� ���� ���·� �Է��� �ּ���.");
			System.exit(0);
		}
		
		int input[] = new int[cntElement];

		System.out.print("�����ϱ� ���� �Է� �� ==> ");
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

		System.out.print("������ ����� ==> ");
		for(int i = 0; i < cntElement; i++) {
			System.out.print(input[i] + " ");
		}
		System.out.println();
	}
}
