package oops;

class PersonPara {
	String name;
	int age;

	// parameterized conostructour to initilize the variable
	public PersonPara(String name, int age) {
		super();// later will discus
		this.name = name;
		this.age = age;

	}

	public void talk() {
		System.out.println("My name is=" + name);
		System.out.println("My age is=" + age);
	}

}

public class PersonParameterized {

	public static void main(String[] args) {
		PersonPara raja = new PersonPara("raja", 25);
		raja.talk();
		PersonPara ravi = new PersonPara("ravi", 27);
		ravi.talk();
	}

}
