
public class JEMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		open();
		f1(100);
		System.out.println(f2());
	}

	static void open() {
	System.out.println("문을열기");
	System.out.println("바닥청소");
	System.out.println("포스키켜");
	System.out.println("빵을진열");
}
	static void f1(int x) {
	System.out.println("x:"+x);
	
	}
	static int f2() {
		System.out.print("f():");
		return 100;
		}
}
class JEMet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("사각형의 넓이:"+calculator(5,10));
	}
	static int calculator(int a,int b) {
		System.out.println("계산결과");
		int area =a*b;
		return area;
	}
}