package week2_Ex;

public class D0701Math {
	public static void main(String[] args) {
	double val = 90.7552;
	System.out.println("round("+val+")="+Math.round(val));
	
	val *= 100;
	System.out.println("round("+val+")="+Math.round(val));
	
	System.out.println("round("+val+")="+Math.round(val)/100);
	System.out.println("round("+val+")="+Math.round(val)/100.0);
	
	System.out.println();
	System.out.printf("ceil(%3.1f)=%3.1f%n",1.1,Math.ceil(1.1));
	System.out.printf("floor(%3.1f)=%3.1f%n", 1.5, Math.floor(1.5));

	}

}
