package basiccorejava;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER ANY BINARY NUMBER");
		int binaryNumber=sc.nextInt();
		int decimalNumber=0,lastDigit,i=1;
		while(binaryNumber!=0) {
			lastDigit=binaryNumber%10;
			decimalNumber=decimalNumber+lastDigit*i;
			i=i*2;
			binaryNumber=binaryNumber/10;
		}
	System.out.println("Decimal Number="+decimalNumber);
	}

} 


                      

