public class Person {
	
		private int age;
		private String name;
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			if(age<0) {
				System.out.println("값이 잘못되었습니다.");
				return;
			}
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {

			this.name = name;
		}
		
		
	} 
