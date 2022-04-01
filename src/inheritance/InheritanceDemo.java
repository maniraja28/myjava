package inheritance;

class Parent {
	String h = "House";

}

class Child extends Parent {
	String v = "car";

	public void childHas() {
		System.out.println("Child has" + h + "as well as " + v);
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {
		Child c = new Child();
		c.childHas();
	}

}
