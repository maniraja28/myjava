package basiccorejava;

import java.util.Scanner;

public class DecimalToOctal {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter any decimal number");
	int dnum=sc.nextInt();
		int[]oct=new int[16];
		int i;
		for(i=0;dnum>0;i++) {
			oct[i]=dnum%8;
			dnum=dnum/8;
		}
		int j;
		for(j=i-1;j>=0;j--) {
			System.out.println(oct[j]);
		}
		
		}
		
		
		
	
	}

}
