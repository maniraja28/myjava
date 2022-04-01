package oops;
class Employee{
	String  companyname;
	String employeename;
	double salary;

public Employee(){
	companyname="infosis";
	
}
public Employee(String employeename,double salary) {
	this();
	this.employeename=employeename;
	this.salary=salary;
	
}
public void show() {
	System.out.println("companyname="+companyname);
	System.out.println("employeename="+employeename);
	System.out.println("salary="+salary);
}
public static  class EmployeeTest {
public static void main(String[]args) {
	Employee raja=new Employee("raja",50000);
		raja.show();
	}
}
}


