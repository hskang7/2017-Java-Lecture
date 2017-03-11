public class ArrayAssign {

	public static void main(String[] args){

		int [] iAry = {1, 2, 3, 4, 5, 11};
		int [] jAry = {6, 7, 8, 9, 10};

		for(int i = 0; i < iAry.length; i++) {
			System.out.print("iAry[" + i + "] = " + iAry[i]);
			System.out.print(((i + 1) % 3 == 0) ? "\n" : "\t");
		}
		System.out.println();
		
		for(int j = 0; j < jAry.length; j++) {
			System.out.print("jAry[" + j + "] = " + jAry[j]);
			System.out.print(((j + 1) % 3 == 0) ? "\n" : "\t");
		}
		System.out.println();

		iAry = jAry;
		System.out.println();
		System.out.println("iAry = jAry;를 한 후에는 ");
		for(int i = 0; i < iAry.length; i++) {
			System.out.print("iAry[" + i + "] = " + iAry[i]);
			System.out.print(((i + 1) % 3 == 0) ? "\n" : "\t" );
		}
		System.out.println();
	}
}