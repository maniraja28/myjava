package ControlStatements;

import java.util.Scanner;

public class SwitchDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Day Number");
		int dno = sc.nextInt();
		switch (dno) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wendesday");
			break;
		default:
			System.out.println("Not a week day");
		}
	}
}