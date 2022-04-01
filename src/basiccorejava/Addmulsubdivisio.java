package basiccorejava;

public class Addmulsubdivisio {

	public static void main(String[] args) {

		int value = addition(3, 1, 6);

		System.out.println(value);

		int subval = subtraction(10, 3);

		System.out.println(subval);

		int multiplyvalue = multipily(11, 5);
		System.out.println(multiplyvalue);
		int divisionvalue = division(21, 2);
		System.out.println(divisionvalue);

	}

	static int addition(int a, int b, int c) {

		int sum = a + b + c;
		return sum;
	}

	static int subtraction(int a, int b) {
		int c = a - b;

		return c;
	}

	static int multipily(int a, int b) {
		int c = a * b;
		return c;

	}

	static int division(int a, int b) {
		int c = a / b;
		return c;
	}

}
