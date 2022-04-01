package inheritance;

class Parent {
	int bankbalance = 50000;

}

class Child extends Parent {
	int balance = 30000;

	public void totalBalance() {
		System.out.println(bankbalance + balance);
	}

}

public class SuperVariable {

	public static void main(String[] args) {
		Child obj = new Child();
		obj.totalBalance();
	}

}
