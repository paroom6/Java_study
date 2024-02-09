import java.util.Arrays;

public class Day16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr =new int [3][5];
		int[][] arr1=new int [3][];
		int[][] arr2= {{1,2,3},{4,5,6}};
		System.out.println("2차원배열"+arr);
		System.out.println("2차원배열의 1차수 "+arr[1]);
		System.out.println("2차원배열의 1치수"+arr[1]);
		System.out.println("2차원배열의 2차수"+arr[1][1]);
		
		for (int i =0; i<arr1.length; i++) {
			arr1[i]= new int[3];
		}

	}

}
