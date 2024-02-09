
public class JEcar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Car.wheel);
		
		Car car1 = new Car();
		System.out.println(car1.speed);
		Car car2 = new Car();
		System.out.println("변경전"); 
		System.out.println("car1.speed:"+car1.speed);
		System.out.println("car2.speed:"+car2.speed);
		System.out.println("car1.wheel"+car1.wheel);
		System.out.println("car2.whee;:"+car2.wheel);
		car2.speed = 100;
		car2.wheel = 5;
		System.out.println("변경후"); 
		System.out.println("car1.speed:"+car1.speed);
		System.out.println("car2.speed:"+car2.speed);
		System.out.println("car1.wheel"+car1.wheel);
		System.out.println("car2.whee;:"+car2.wheel);
		
	}

}
class Car {

	static int wheel = 4;
	int speed;

}
