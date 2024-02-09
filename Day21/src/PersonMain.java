
public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		Person p2 = new Person(17, "이태양","송도고등학교");
		p1.setAge(18);
		p1.setName("이영애");
		p1.setSchool("마산고");
		System.out.println("이름: "+p1.getName()+"나이: "+p1.getAge()+"학교: "+p1.getSchool());
		System.out.println("이름: "+p2.getName()+"나이: "+p2.getAge()+"학교: "+p2.getSchool());
	}

}
