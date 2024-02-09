
public class Day9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int a = 2; a < 10; a++) {
			for(int b = 1; b <= 9; b++) {
			System.out.print(a + "X" + b + "=" + (a*b) + "\t");
		}

	    }
	}
}

class Tri {

	public static void main(String[] args) {
		
		for(int i = 0; i<7; i++) {
			for(int j = 0; j<7-i; j++) {
				System.out.print(" ");
			}
		for(int star = 0; star < (i+1); star++) {
			System.out.print("*");
		}
		System.out.println();
		}
	}
}