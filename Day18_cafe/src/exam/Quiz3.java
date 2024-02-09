package exam;

import java.util.HashMap;
import java.util.Scanner;

public class Quiz3 {
	/*
	 * 나라 이름과 인구수를 입력받아 Map에 저장하고 
	 * 그만을 입력하면 입력을 멈추고 검색을 실행하세요 
	 * 나라이름을 검색하면 그 해당국가의 인구수를 출력하고 
	 * 그만을 입력하면 프로그램 종료 !! 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		System.out.println("나라 이름과 인구를 입력하세요 >> ");
		
		while(true) {
			System.out.println("나라이름, 인구 >> ");
			String name = sc.next();
			if(name.equals("그만")) {
				break;
			}
			int population = sc.nextInt();
			nations.put(name, population);
		}
		
		while(true) {
			System.out.println("인구검색 >> ");
			String name = sc.next();
			if(name.equals("그만")) {
				System.out.println("종료");
				break;
			}
			if(nations.get(name) == null) {
				System.out.println(name + " 국가는 없습니다.");
			} else {
				System.out.println(name + "의 인구는 " + nations.get(name));
			}
		}
	}
}
