package day5;

public class Day5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		byte b = 10;
		long c = 20;
		double d = 3.14;
		
		int re = a + b;
        long re2 = a + c;
        
        System.out.println(a % 3);
        
        
	}

}

class Day6 {

	public static void main(String[] args) {
	 int num = 10;
	 int sum = 0;
	 sum = num++;
	 System.out.println("sum=" + sum + ", num :" +num);
	 sum = ++num;
	 System.out.println("sum=" + sum + ", num :" +num);
	}
}

class Da {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = 15;
		int c = 12;
		
		System.out.println(a>=b);
		System.out.println(a < b);
		System.out.println(c == a);
		System.out.println(a != b);
		//논리연산 &&(and) ||(or)
		System.out.println( (a<b)&&(b>c));
		System.out.println( (a>b)&&(b>c));
		System.out.println( (a>b)||(b>c));
	}
}
	
class Aa5 {
	
	public static void main(String[] args) {
		
		boolean a = true;
		boolean b = false;
		boolean c=true;
		
		System.out.println(a&&b);
		System.out.println(a&&c);
		System.out.println(b||b);
		System.out.println(!a);

	}
}

class Aa {

public static void main(String[] args) {
	int a = 15;
	int b = 5;
	System.out.println(a&b);
	System.out.println(a|b);
	System.out.println(a^b);
	System.out.println(~b);
	System.out.println(a>>2);
	System.out.println(b<<4);
}
}
