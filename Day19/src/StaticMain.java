
public class StaticMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day19static st1 = new Day19static();
		Day19static st2 = new Day19static();
		st1.myname = "홍길동";
		st2.myname = "고길동";
		Day19static.school ="강남고등학교";
		st1.schoolInfo1();
		System.out.println("나의 학교는"+Day19static.school);
		st2.schoolInfo();
		Day19static.schoolInfo();
		
	}

}
