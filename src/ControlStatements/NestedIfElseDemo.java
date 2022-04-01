package ControlStatements;

public class NestedIfElseDemo {

	public static void main(String[] args) {
		int sridevi, vinnu, sandhya;
		sridevi = 18;
		vinnu = 20;
		sandhya = 22;
		if (sridevi > vinnu) {
			if (sridevi > sandhya) {
				System.out.println("sridevi is older than vinnu and sandhya");
			}

			else {
				System.out.println("vinnu is older than sridevi and sandhya");
			}
		} else {
			if (sandhya > vinnu) {
				System.out.println("sandhya is older than vinnu and sridevi");

			}

			else {
				System.out.println("vinnu is older than  sandhya and sridevi");
			}
		}
	}
}
