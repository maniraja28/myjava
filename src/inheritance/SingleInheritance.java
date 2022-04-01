package inheritance;

class Father {
	int Fatherbankbalance = 2000;

	public void fathersBalance() {
		System.out.println("father bankbalance::" + Fatherbankbalance);
	}
}

class Son extends Father {
	int Sonbankbalance = 1000 + Fatherbankbalance;

	public void sonsBalance() {
		System.out.println("son bankbalance::" + Sonbankbalance);

	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		Father f = new Father();
		Son s = new Son();
		f.fathersBalance();
		s.sonsBalance();
	}

}
