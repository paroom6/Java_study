
public class MoneyCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int money = 30000;
		int count =0;
		while(true) {
			if(money<1500) {
				System.out.println("버스를" +count+"만큼 탔습니다");
				System.out.println("버스카드 : "+money+"남았습니다 버스카드를 충전해 수세요.");
				return;
			}
			money-=1500;
			count++;
		}

	}

}
