import java.util.Arrays;

public class Day12 {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		int[] arr = new int[5];
		String[] arrs = new String[5];
		
		int arri[] = {1, 2, 3,4,5};
		
		System.out.println(arr);//배열의 주소
		
		System.out.println(arr[0]);
		System.out.println(arr[2]);
		System.out.println(arri[3]);
		arr[1]=1;
		arr[2]=2;
		arr[3]=3;
		

	}

}
class Day12arr {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		int[] arr1 = new int[10];
		for(int i=0; i<=9; i++) {
			arr1[i] = (int)(Math.random()*100+1);
		}
		int s = 0;
		for(int i = 0; i<arr1.length; i++) {//length는 자바에선 속성
			System.out.println(arr1[i]+"\t");
			s +=arr1[i]; 
		}
		System.out.println("\n합:" + s);
	}
}
class Day12low {

	public static void main(String[] args) {
		int[] arr1 = new int[10];
		for(int i=0; i<=9; i++) {
			arr1[i] = (int)(Math.random()*50+1);
		}
		System.out.println("정렬전:" + Arrays.toString(arr1));
		// 버블정렬
		int temp =0;
		for(int i = 0; i<arr1.length; i++) {
			for(int j=0; j<(arr1.length-1)-i ; j++) {
				if(arr1[j]>arr1[j+1]) {
					temp = arr1[j+1];
					arr1[j+1] = arr1[j];
					arr1[j] = temp;
				}
			}
		}
		System.out.println("정렬후:" + Arrays.toString(arr1));
	}
}
	