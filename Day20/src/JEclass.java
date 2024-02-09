
public class JEclass {
	public static void main(String[] args) {
		ClassA ca = new ClassA();
		System.out.println(ca.x);
		ca.f1();
}
}

class ClassA{
	int x= 10;
	void f1() {
		System.out.println("fl()");
	}
}