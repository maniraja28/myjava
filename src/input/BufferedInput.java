package input;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedInput {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter Your name");
String name=br.readLine();
System.out.println("Enter Your age");
int age=Integer.parseInt(br.readLine());
System.out.println("Name:"+name+"\t"+"age:"+age);
if (age>=18)
	System.out.println("Hello"+name+"Youre elgibile for voter id");
else
	System.out.println("Hello+name"+"Youre not elgibile for voter id");
		

	}

}
