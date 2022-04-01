package inheritance;
class Employee{
	int salary;
	
}
class SoftwerDeveloper extends Employee{
	public void SoftwareDevloper(int i) {
		salary=i;
		
		
	}
	public void displaySalary() {
		System.out.println("Software Devloper's salary in US$::"+salary);
	}
}
class SoftwareTester extends Employee{
	public void softwareTester(int i) {
		salary=i;
	}
	public void diplaySalary() {
		System.out.println("Software Testers salary in US$::"+salary);
	}
}

public class HierachicalInheritance {

	public static void main(String[] args) {
SoftwareDeveloper d=new SoftwareDeveloper(90000);
SoftwareTester t=new SoftwareTester(80000);
d.displaySalary();
System.out.println("---------------------");
t.displaySalary();

	}

}
