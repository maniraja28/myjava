package oops;

public class Person1 {
	
	String name="john";
	int age=21;
	public void show() {
	String name1="roger";//having same name as the instance variabile
	int age1=30;
		System.out.println("Name:"+name1);
		System.out.println("Age:"+age1);
	}

	public static void main(String[] args) {
Person1 obj=new Person1();
obj.show();
	}

}
