package ControlStatements;

import java.util.Scanner;

public class Marks {
	public double percentage(int a, int b, int c, int d) {
		return (a + b + c + d) / 4.0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Marks m = new Marks();
		System.out.println("Enter marks for maths,physics,cs and english");
		double total = m.percentage(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
		if (total >= 85)
			System.out.println(total + "Grade A");
		else if (total >= 70)
			System.out.println(total + "Grade B");
		else if (total >= 55)
			System.out.println(total + "Grade C");
		else if (total >= 40)
			System.out.println(total + "Grade D");
		else
			System.out.println(total + "Grade E");
	}
}
