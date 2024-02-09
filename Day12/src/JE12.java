import java.util.Arrays;

public class JE12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[3];
		arr[0] = 100;
		arr[1] = 80;
		arr[2] = 70;
		for(int i = 0; i<3; i++) {
		System.out.println(i+1 + "번 학생의 점수: " + arr[i] );
		

	}

}
}

 class JE12day {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= new int[3];
		double ard[]=new double[3];
		char arc[] = new char[3];
		String ars[] = new String[3];
		
		for(int i=0; i<3; i++) {
			System.out.print(ar[i]+" \n");
		}
		for(int i=0; i<3; i++) {
			System.out.print(ard[i]+" \n");
		}
		for(int i=0; i<3; i++) {
			System.out.print(arc[i]+" \n");
		}
		for(int i=0; i<3; i++) {
			System.out.print(ars[i]+" \n");
		}
	}
}
 
 class JE12day1 {

	public static void main(String[] args) {
		int a[] = new int[] {10,20,4,25,18};
		for(int i=0; i<5; i++) {
			System.out.println(a[i]);
		}
		int c[]=new int[10];
		for(int j=0;j<c.length;j++) {
			c[j]=j;
		
	}
		for(int j=0;j<c.length;j++) {
			System.out.print(c[j]);
		}
		System.out.println();
		System.out.println(Arrays.toString(c)); 
		
 }
	}
 
 class JE12day2 {

		public static void main(String[] args) {
			int[]s = {100,95,90,88,93};
			int sum=0;
			for(int i=0;i<s.length;i++) {
				sum+=s[i];
				}
			System.out.println("평균점수:" +sum/(float)s.length);
	}
}