package inheritance;
class GrandFather{
	int GrandFatherbankbalance=3000;
	public void grandfathersbalance() {
		System.out.println("grandfathersbankbalance:"+GrandFatherbankbalance);
	}
}
	class Father extends GrandFather{
		int Fatherbankbalance=2000+GrandFatherbankbalance;
		public void fathersBalance() {
			System.out.println("Father's bankbalance":Fatherbankbalance);
		}
	
	class Son extends Father{
		int Sonbankbalance=1000+Fatherbankbalance;
		public void sonbalance() {
			System.out.println("Sons bankbalance:"+Sonbankbalance);
		}
	}


public class MultilevelInheritance {

	public static void main(String[] args) {
		GrandFather gf=new GrandFather();
		Father f=new Father();
		Son s=new Son();
		gf.grandFatherBalance();
		System.out.println("-----------");
		f.fatherbalance();
		System.out.println("----------");
		s.sonbalance();
				
		
	}
			}

}
