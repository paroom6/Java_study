
public class Bank {
	int money;
	public void setMoney(int money) {
		if(money<0) {
			System.out.println("값이 잘못되었습니다.");
			return;
		}
		this.money = money;
	}
public int getMoney() {
	return money;
	}
}

