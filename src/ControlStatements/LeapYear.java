package ControlStatements;

public class LeapYear {
public int year(int year) {
			if (year%100==0) {
				if (year%400==0)
					System.out.println(year+"is leap year");
				else
					System.out.println(year+"is not a leap year");
			}
			else if (year%4==0) {
				System.out.println(year+"is leap year");
				
			}else {
				System.out.println(year+"is not a leap year");
			}
			return 0;
			}
    public static void main(String args[]) { 

	LeapYear obj=new LeapYear();
	int result1=obj.year(2000);
    int result2=obj.year(2500);
    int result3=obj.year(3000);
    int result4=obj.year(3500);
    int result5=obj.year(4000);
}
}
