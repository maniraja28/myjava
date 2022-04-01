package operators;

public class LogicalDemo {

	public static void main(String[] args) {
int age=19;
String nationality="Indian";
int country_code=22;
//using logical and operators(&&)
if (age>=18 && nationality.equals("Indian")) {
	System.out.println("You are elgibile for voting");
	
}
	//using logical or operators(||)
if (age>=18 &&(nationality.equals("Indian")|| country_code==1)) {
	System.out.println("Youre eligibile for voting");

}
//using logical not operator(!)
if(country_code!=1) {
	System.out.println("YOure not eligibile for voting");
	
}

	}

}
