package practice;

public class SumOfDigits {

	public static void main(String[] args) {

		// Input -> a = 12345 o/p => 15
		// Input -> a = 673737 o/p => 33

		int n = 356;
		
		// 1+2+3
		//3+2+1

		// 1+2+3

		// % -> remainder / -> quoficient

		// int rem = n % 10; 1%10 -> 1

		// int num = n/10; 1/10 -> 0

		int sum = 0;

		while (n > 0) {

			
			n = n / 5;

			sum = sum + n;

		}

		System.out.println("Sum is ... " + sum);

	}

}
