package oops;

class PersonCon {
	String name;
	int age;

	// no argument constructor initilize the instance variabiles
	public PersonCon() {
		name = "Raja";
		age = 25;
	}

	public void talk() {
		System.out.println("My name is=" + name);
		System.out.println("My age is=" + age);
	}
}

public class PersonConstructor {

	public static void main(String[] args) {
		PersonCon raja = new PersonCon();
		raja.talk();
	}

}
