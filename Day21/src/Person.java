
public class Person {
	private int age;
	private String name;
	private String school;
		
	
	public Person() {
		System.out.println("클래스 생성");
		
	}
	public Person(int age, String name) {
		this.setName(name);
		this.setAge(age);
	}
	public Person(int age, String name, String school) {
		this(age,name);
		this.setSchool(school);
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	
}
