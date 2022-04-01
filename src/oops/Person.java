package oops;

public class Person {

	String name = "raja";
	int age = 25;

	public void show() {
		String name = "ravi";
		int age = 27;
		System.out.println("Name:" + name);
		System.out.println("Age:" + age);
	}

	public static void main(String[] args) {
		Person obj = new Person();
		obj.show();
	}

}
