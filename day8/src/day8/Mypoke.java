package day8;

import java.util.Random;

public class Mypoke {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random=new Random();
		System.out.println("1.피카츄");
		System.out.println("2.꼬부기");
		System.out.println("3.이상해씨");
		int mypoke=random.nextInt(3)+1;//0~2 > 1~3
		System.out.println("선택된 번호:" + mypoke);
		switch(mypoke) {
		case 1:
			System.out.println("피카츄");
			break;
		case 2:
			System.out.println("꼬부기");
			break;
		case 3:
			System.out.println("이상해씨");
			break;
		}
	}

}
