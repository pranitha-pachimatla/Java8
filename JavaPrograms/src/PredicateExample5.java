import java.util.Scanner;
import java.util.function.Predicate;

//user authentication
class User {
	String userName;
	String password;

	User(String userName, String password) {
		this.userName = userName;
		this.password = password;

	}
}
public class PredicateExample5 {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter User Name:");
	String userName= sc.nextLine();
	System.out.println("Enter Password:");
	String password= sc.nextLine();
	User user= new User(userName,password);
		Predicate<User> u =user1->user1.userName.equals("Pranitha") && user1.password.equals("Vaisshnavi");
		if(u.test(user)) {
			System.out.println("VALID USER");
		}
		else
		{
			System.out.println("INVALID USER");
		}
}
}
