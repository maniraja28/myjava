package oops;

public class PersonReference {

	public static void main(String[] args) {
		PersonRef raja=new PersonRef();
		//using object refernce only variabiles are initilized
		raja.name="raja";
		raja.age=25;
		raja.talk();
		PersonRef sita=new PersonRef();
		sita.name="sita";
		sita.age=23;
		sita.talk();
		
	}

}
