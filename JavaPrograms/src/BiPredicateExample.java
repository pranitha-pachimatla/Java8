//sum os two numbers is even or not
import java.util.function.BiPredicate;

public class BiPredicateExample {
public static void main(String args[]) {
	BiPredicate<Integer, Integer> bp=(a,b)->(a+b)%2==0;
	System.out.println("Sum of A and B is even: "+ bp.test(15, 20));
	System.out.println("Sum of A and B is even: "+ bp.test(15, 25));
}
}
