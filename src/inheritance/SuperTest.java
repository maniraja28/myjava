package inheritance;

class x{
	public x() {
		System.out.println("i am base class constructour ");
	}
}
class y extends x{
	public y() {
		super();
		System.out.println("iam derived class constructour");
	}
}
public class SuperTest{

	public static void main(String[] args) {
		y obj=new y();
		
	}

}
