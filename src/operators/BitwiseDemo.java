package operators;

public class BitwiseDemo {

	public static void main(String[] args) {
int num1=11;//binary form of 11=00001011
int num2=22;//binary form of 22=00010110
int result;
result=num1&num2;
System.out.println("Performing Bitwise And operation");
System.out.println("num1&num2:"+result);
result=num1|num2;
System.out.println("\nPerforming Bitwise OR operation");
System.out.println(num1 | num2+result);
result=num1^num2;
System.out.println("\nPerforming Bitwise XOR operation");
System.out.println("num1^num2:"+result);
result=~num1;
System.out.println("\nPerforming Bitwise Compiliment operator");
System.out.println("~num1:+result");
}

}
