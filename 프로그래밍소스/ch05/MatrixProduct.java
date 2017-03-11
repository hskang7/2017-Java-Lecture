public class MatrixProduct {
	
	public static void main(String[] args) {
		
		/* aMtx�� 3 * 2 ��Ʈ������ ���� ������ ����.
		*		| 2 4 |
		* aMtx =| 3 4 |
		*		| 1 2 |
		*/
		//int aMtx[][] = {{2, 4}, {3, 4}, {1, 2}};
		int [] aMtx[] = {{2, 4}, {3, 4}, {1, 2}};

		/* bMtx�� 2 * 3 ��Ʈ������ ���� ������ ����.
		* bMtx =| 1 3 2 |
		*		| 2 3 1 |
		*/
		//int[] bMtx[] = {{1, 3, 2}, {2, 3, 1}};
		int bMtx[][] = {{1, 3, 2}, {2, 3, 1}};

		System.out.println("aMtx.length = " + aMtx.length);
		System.out.println("aMtx[0].length = " + aMtx[0].length);

		for(int i = 0; i < aMtx.length; i++) {
			for(int j = 0; j < aMtx[0].length; j++) {
				System.out.print("\t aMtx[" + (i + 1) + "]" +
						"[" + (j + 1) + "] = " + aMtx[i][j]);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("bMtx.length = " + bMtx.length);
		System.out.println("bMtx[0].length = " + bMtx[0].length);

		for(int i = 0; i < bMtx.length; i++) {
			for(int j = 0; j < bMtx[0].length; j++) {
				System.out.print("\t bMtx[" + (i + 1) + "]" +
						"[" + (j + 1) + "] = " + bMtx[i][j]);
			}
			System.out.println();
		}
		System.out.println();

		//create cMtx for multiplication of two matrix
		//int cMtx[][] = new int[aMtx.length][bMtx[0].length];
		//int[][] cMtx = new int[aMtx.length][bMtx[0].length];
		System.out.println("�� ����� �� : cMtx = aMtx * bMtx >> \n");

		int[] cMtx[] = new int[aMtx.length][bMtx[0].length];
		System.out.println("cMtx.length = " + cMtx.length);
		System.out.println("cMtx[0].length = " + cMtx[0].length);

		for (int i = 0; i < aMtx.length; i++){
			for(int j=0; j < bMtx[0].length; j++){
				for(int k = 0; k< aMtx[0].length; k++){
					cMtx[i][j] += aMtx[i][k]*bMtx[k][j];
				}
				System.out.print("\t cMtx["+(i+1)+"]" +
						"["+(j+1)+"]="+cMtx[i][j]);
		}
		System.out.println();
		}
	}
}


