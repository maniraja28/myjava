package basiccorejava;

import  java.util.*;

public class Sum {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
System.out.println("Give me the input");
int input = s.nextInt();
int a=input%10;
int b=input/10;
int output=a+b;
System.out.println("output"+output
		);
	}

}