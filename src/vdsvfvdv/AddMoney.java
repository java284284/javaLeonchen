package vdsvfvdv;

class IcCard {
	long id;
	int money;
	
	void showInfo () {
		System.out.print("id" + id);
		System.out.println(", cash" + money +"元");
	}
    
	void add (int value) {
		money += value;
		System.out.println("加值成功,本次加值 " + value + " 元 ");
	}
}

public class AddMoney {

	public static void main(String[] args) {
		IcCard myCard = new IcCard();
		
		myCard.id = 0x336789AB;
		myCard.money = 3000;
		
		myCard.add(1000);
		myCard.showInfo();
	}

}
