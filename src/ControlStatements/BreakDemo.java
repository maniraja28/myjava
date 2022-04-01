package ControlStatements;

public class BreakDemo {

	public static void main(String[] args) {
		int x;
		for(x=1;x<=20;x++) {
			if(x%20==0) 
				break;
			System.out.println(x);
		}
		System.out.println("outside the loop");
	}
}
