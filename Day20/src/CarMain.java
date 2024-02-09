
public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CAr c = new CAr();
		System.out.println("시동초기화: "+ c.poweron);
		System.out.println("색상초기화: "+ c.color);
		System.out.println("바퀴초기화: "+ c.wheel);
		System.out.println("속력초기화: "+ c.speed);
		System.out.println("와이퍼초기화: "+ c. wiperon);
	c.power();
	System.out.println("시동"+c.poweron);
	c.power();
	System.out.println("시동"+c.poweron);
	c.color="black";
	System.out.println("색상"+c.color);
	
	CAr c1 = new CAr();
	CAr c2 = new CAr();
	c1.color="red";
	c2.color="black";
	c1.speedup();
	c2.wiper();
	System.out.println("c1 색상 "+ c1.color);
	System.out.println("c2 색상 "+ c2.color);
	System.out.println("c1속력: "+ c1.speed);
	System.out.println("c1와이퍼: "+ c1. wiperon);
	System.out.println("c2와이퍼: "+ c2. wiperon);

	System.out.println("c1속력: "+ c2.speed);

	
	}

}
