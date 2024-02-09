import java.util.Arrays;
import java.util.Scanner;

public class JEcopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {1,2,3,4,5,6};
		int []b= new int[7];
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		System.arraycopy(a, 2, b, 3, 4);
		System.out.println(Arrays.toString(b));

	}

}


class JEforeach {

	public static void main(String[] args) {
		String a[]= {"java","hello","programming"};
		for(String i:a) {
			System.out.println(i);
		}
		int b[]={1,2,3,4,5};
		for(int i:b) {
			System.out.println(i);
			
		}
	}
}

class JEfrult {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String fruits[] = new String[3];
		for(int i =0; i<3; i++) {
			System.out.print("주문할 과일을 입력: ");
			fruits[i] = sc.next();
		}
		System.out.println("주문받은 과일");
		for(String i : fruits) {			
			System.out.print(i+"\t");
		}

		}
	}
