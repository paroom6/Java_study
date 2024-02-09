import java.util.Arrays;
import java.util.Comparator;

public class Day15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {5,7,1,4,11,9,10,2,4,3};
		System.out.println("정렬 전: "+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("정렬 후: "+ Arrays.toString(a));
		System.out.println();
		
		Integer[] arr = {5,7,1,4,11,9,10,2,4,3};
		System.out.println("정렬 전: "+Arrays.toString(arr));
		Arrays.sort(arr,Comparator.reverseOrder());
		System.out.println("정렬 후: "+ Arrays.toString(arr));
	}

}


class Day15arr {

	public static void main(String[] args) {
		int[] card = {3,7,10,11,12};
		int[] newcard = Arrays.copyOf(card,card.length);
		System.out.println("복사 후: " + Arrays.toString(newcard));
		card[1]=10;
		newcard[3]=22;
		System.out.println("card: " + Arrays.toString(card));
		System.out.println("newcard: " + Arrays.toString(newcard));

		
		
	}
}