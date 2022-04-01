package input;

import java.util.Scanner;

public class ScannerInput {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter Employee Id");
int id=sc.nextInt();
System.out.println("Enter Employee salary");
double salary=sc.nextDouble();
System.out.println("Enter The Employee Name");
String name=sc.next();
System.out.println("Employee Details Are");
System.out.println("Employee Id="+id);
System.out.println("Employee Salary="+salary);
System.out.println("Employee Name="+name);
	}

}
