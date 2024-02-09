
public class Day14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,3,5,7,9};
		int[] b = null;
		b=a;
		for(int i=0; i<5; i++) {
			System.out.print(b[i]+"\t");

		}
		a[1]=11;
		b[0]=8;
		System.out.println();
		System.out.println("b값:");
		for(int i=0; i<5; i++) {
			System.out.print(b[i]+"\t");
		}
		System.out.println();
		System.out.println("a값:");
		for(int i=0; i<5; i++) {
			System.out.print(a[i]+"\t");
		}
	}

}


class Daycopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,3,5,7,9};
		int[] b = new int[5];
		for(int i=0; i<5; i++) {
			b[i]=a[i];
		}
		for(int i=0; i<5; i++) {
			System.out.print(b[i]+"\t");

		}
		a[1]=11;
		b[0]=8;
		System.out.println();
		System.out.println("b값:");
		for(int i=0; i<5; i++) {
			System.out.print(b[i]+"\t");
		}
		System.out.println();
		System.out.println("a값:");
		for(int i=0; i<5; i++) {
			System.out.print(a[i]+"\t");
		}
		
		
		
	}
}

class Deepcopy {

	public static void main(String[] args) {
		int[] card = {1,6,9,8,2,7};
		int[] newcard = new int[5];
		System.arraycopy(card, 1, newcard, 0, newcard.length);
		System.out.println("card:");
		for(int i=0; i<card.length; i++) {
			System.out.print(card[i]+"\t");
		}
		System.out.println();
		System.out.println("newcard:");
		for(int i=0; i<newcard.length; i++) {
			System.out.print(newcard[i]+"\t");
		}
		card[1]=11;
		newcard[3]=20;
		System.out.println();

		System.out.println("card:");
		for(int i=0; i<card.length; i++) {
			System.out.print(card[i]+"\t");
		}
		System.out.println();
		System.out.println("newcard:");
		for(int i=0; i<newcard.length; i++) {
			System.out.print(newcard[i]+"\t");
		}

		
		
	}
}
