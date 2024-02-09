
public class JEclac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("정수의 사칙연산");
	 System.out.println("sum(10,20)"+sum(10,20));
	 System.out.println("sub(10,20)"+sub(10,20));
	 System.out.println("mul(10,20)"+mul(10,20));
	 System.out.println("div(10,20)"+div(10,20));
	 System.out.println("실수의 사칙연산");
	 System.out.println("sum(10.2,20.3)"+sum(10.2,20.3));
	 System.out.println("sub(10.2,20.3)"+sub(10.2,20.3));
	 System.out.println("mul(10.2,20.3)"+mul(10.2,20.3));
	 System.out.println("div(10.2,20.3)"+div(10.2,20.3));
	}

	static int sum(int x, int y) {return x+y;}
	static double sum(double x, double y) {return x+y;}
	
	static int sub(int x, int y) {return x-y;}
	static double sub(double x, double y) {return x-y;}
	
	static int mul(int x, int y) {return x*y;}
	static double mul(double x, double y) {return x*y;}
	
	static int div(int x, int y) {return x/y;}
	static double div(double x, double y) {return x/y;}
	
	static String sum(String x, String y) {return x+y;}
}
