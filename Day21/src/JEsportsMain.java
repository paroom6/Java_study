
public class JEsportsMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Member mem1 = new Member();
		Member mem2 = new Member();
		Member mem3 = new Member();
		Member mem4 = new Member();
		
		Member.centerName = "hello";
		mem1.name = "김철수";
		mem1.age = 32;
		mem1.gender = "남자";
		
		mem2.name = "김민호";
		mem2.age = 28;
		mem2.gender = "남자";
		
		mem3.name = "이영희";
		mem3.age = 24;
		mem3.gender = "여자";
		
		mem4.name = "고석천";
		mem4.age = 32;
		mem4.gender = "남자";
		
		
		System.out.println("mem1------");
		mem1.info();
		System.out.println("mem2------");
		mem2.info();
		System.out.println("mem3------");
		mem3.info();
		System.out.println("mem4------");
		mem4.info();


	}
}
class Member{
	static String centerName;
	String name;
	int age;
	String gender;
	void info() {
		System.out.println("center: "+centerName);
		System.out.println("name: "+name);
		System.out.println("age: "+age);
		System.out.println("gender: "+gender);
	}
}


