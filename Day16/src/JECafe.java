import java.util.Scanner;

public class JECafe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int count = 0;
		//주문은 1번에 5개 까지
		String list[] = new String[5];
		int sum = 0;
		while(true) {
			System.out.println("cafe");
			System.out.println("1.주문하기");
			System.out.println("2.취소하기");
			System.out.println("3.결제하기");
			System.out.println("4.끝내기");
			System.out.println("입력:");
			int num=sc.nextInt();
			if(num==1) {
				String menuName;
				int menuPrice;
				System.out.println("meue");
				System.out.println("1.아메리카노\t3800원");
				System.out.println("2.에스프레소\t2400원");
				System.out.println("3.카페라테\t4200원");
				System.out.println("4.밀크티\t5100원");
				System.out.print("주문할 메뉴번호:");
				int menuNum=sc.nextInt();
				if(menuNum==1) {
					menuName="아메리카노";
					menuPrice=3800;
				}else if(menuNum==2) {
					menuName="에스프레소";
					menuPrice=2400;
				}else if(menuNum==3) {
					menuName="카페라테";
					menuPrice=4200;
				}else if(menuNum==4) {
					menuName="밀크티";
					menuPrice=5100;
				}else {
					System.out.println("잘못입력하셨습니다.");
					continue;
				}
				sum+=menuPrice;
				list[count]=menuName;
				count++;
				System.out.println("주문하신 메뉴는"+menuName+"입니다.");
				System.out.println("가격은"+menuPrice+"입니다.");
			}
			else if(num==2) {
				System.out.println("주문한 메뉴 리스트");
				for(int i=0; i<count; i++) {
					System.out.println(i+1+":"+list[i]);
				}
				System.out.print("취소할 메뉴 번호: ");
				int cancel=sc.nextInt();
				if(1<=cancel &&cancel<=count) {
					String delMenu=list[cancel-1];
					System.out.println(delMenu+"메뉴 삭제");
					for(int i=cancel-1;i<count;i++) {
						list[i]=list[i+1];
					}
					if(delMenu.equals("아메리카노")){
						sum-=3800;
					}else if(delMenu.equals("에스프레소")){
						sum-=2400;
					}else if(delMenu.equals("카페라떼")){
						sum-=4200;
					}else if(delMenu.equals("밀크티")){
						sum-=5100;
					}
					count--;

				}
			}
			else if(num==3) {
				System.out.println("결제할 금액:"+sum+"원");
				System.out.print("지불할 금액: ");
				int money=sc.nextInt();
				if(money<sum) {
					System.out.println("잔액이 부족합니다.");
					continue;
				}else {
					System.out.println("잔액은"+(money-sum)+"입니다.");
					sum=0;
					for(int i=0;i<5;i++) {

						list[i]=null;
					}
					count=0;
			}
			}
			else if(num==4) {
				System.out.println("반복종료");
				break;
			}
			else {
				System.out.println("잘못입력하셨습니다.");
			}
		}
	

}

}