import java.util.Scanner;

public class MathMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("넓이를 구할 원의 반지름: ");
		int ban = sc.nextInt();
		double result = (ban*ban)*Mathcalc.pi;
		Mathcalc.print(result);

	}

}
