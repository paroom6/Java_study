package day8;

public class Day8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		 sum = sum + 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;
		 System.out.println(sum);
		 sum = 0;
		 for(int i = 1; i <=10; i++) {
			 sum = sum + i;
		 }
		 System.out.println(sum);
		
	}
}




















class For_test2{
	
	public static void main(String[] args) {
		
		int a = 0;
		
		for(int b = 1; b<=100; b++) {
			
			if(b % 2 ==0) {
				a = a + b;
			}
		}
		System.out.println("짝수의 합 : " + a);

		
	}
}