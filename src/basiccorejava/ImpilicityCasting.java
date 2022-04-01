package basiccorejava;

public class ImpilicityCasting {

	public static void main(String[] args) {
		int intvarible=25;
		long intvariable = 0;
		long intariable = 0;
		long longVariable=intariable;
		float floatvariable=longVariable;
		double doublevariable=floatvariable;
		System.out.println("Integer value is"+intvariable);
		System.out.println("long value is"+longVariable);
		System.out.println("Float value is"+floatvariable);
		System.out.println("Double value is"+doublevariable);
		

	}

}
