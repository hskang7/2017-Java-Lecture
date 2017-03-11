public class ReferenceType {

	public static void main(String[ ] args) {

	int	intPri;
	Integer intRef;

	intPri = 7;
	intRef = new Integer(7);

	System.out.println("intPri = " + intPri);
	System.out.println("intRef = " + intRef);

	intPri = intPri + intRef.intValue();
	System.out.println("intPr + intRef = " + intPri);
	}
}


