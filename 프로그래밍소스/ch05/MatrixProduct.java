public class MatrixProduct {
	
	public static void main(String[] args) {
		
		/* aMtx는 3 * 2 매트릭스로 값은 다음과 같다.
		*		| 2 4 |
		* aMtx =| 3 4 |
		*		| 1 2 |
		*/
		//int aMtx[][] = {{2, 4}, {3, 4}, {1, 2}};
		int [] aMtx[] = {{2, 4}, {3, 4}, {1, 2}};

		/* bMtx는 2 * 3 매트릭스로 값은 다음과 같다.
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
		System.out.println("두 행렬의 곱 : cMtx = aMtx * bMtx >> \n");

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


