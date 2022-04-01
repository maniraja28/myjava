package oops;
class Mango{
	boolean sweet;
	Mango(boolean b){
		sweet=b;
	}
	Mango(Mango m){//copy conostructor
		sweet=m.sweet;
		
	}

public void flavour() {
	if(sweet)
		System.out.println("Mango is sweet");
	else
		System.out.println("Mango is not sweeet");
}
	
}

public class FlavourTest {

	public static void main(String[] args) {
		Mango m1=new Mango(true);
		m1.flavour();
		Mango m2=new Mango(m1);
		m2.flavour();
		m1.sweet=false;
		m1.flavour();
	}

}
