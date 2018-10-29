import java.util.Scanner;
import java.util.function.Function;

public class FunctionExample6 {
	public static void main(String args[]) {
		Function<String, String> f1= s1->s1.toLowerCase();
		Function<String,String> f2= s2->s2.substring(0, 5);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UserName:");
		String userName = sc.next();
		System.out.println("Enter Password:");
		String password = sc.next();
		if(f1.andThen(f2).apply(userName).equals("Pran") && password.equals("Vaisshnavi")){
			System.out.println("Valid User");
		}
		else
		{
			System.out.println("Valid User");
		}
	}
}
