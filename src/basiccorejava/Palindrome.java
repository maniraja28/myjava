package basiccorejava;

public class Palindrome {

	public static void main(String[] args) {
		int a=33;
		int b=a%10;//3
		int c=b*100;//300
		int d=a/10;//33
		b=d%10;//3
		c=c+(b*10);//330
		d=d/10;//3
		b=d%10;//3
		c=c+(b*1);//333
		if(a==c)
			System.out.println(a+"is a palindrome.");
		else
			System.out.println(a+"is not a palindrome.");

		
	}
	
}
