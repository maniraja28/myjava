package basiccorejava;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.println("ENTER ANY DECIMAL NUMBER");
		int decimalnumber=sc.nextInt();//store programmer given decimal value in 'decimalnumber'variable
		int[]bin=new int[10];//to store binary digits (reminders)
		int i;//array index
		for(i=0;decimalnumber>0;i++) {//continuosly iterated up to quotient becomes zero
		bin[i]=decimalnumber%2;//to get remainder
		decimalnumber=decimalnumber/2;//to get quotient
		}
		for(int j=i-1;j>=0;j--)//to read binary numbers in reverse order
        System.out.print(bin[j]);
	}

}
