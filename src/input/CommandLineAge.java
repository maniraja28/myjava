package input;

public class CommandLineAge {

	public static void main(String[] args) {
		int Age=Integer.parseInt(args[0]);
		if (Age>18)
			System.out.println("You are elgible for voter id");
		else
			System.out.println("You are not eligibile for voter id");
	}

}
