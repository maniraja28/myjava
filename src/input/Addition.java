package input;

public class Addition {
	public void sum(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		Addition obj = new Addition();
		obj.sum(10, 20); 

	}
}