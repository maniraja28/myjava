package oops;

class PersonM {
	String name;
	int age;

	public void assign(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void talk() {
		System.out.println("My name is =" + name);
		System.out.println("My age is =" + age);
	}
}

public class PersonMethod {

	public static void main(String[] args) {
		PersonM Raja = new PersonM();
		Raja.assign("Raja", 25);
		Raja.talk();

	}

}
