import java.util.function.Predicate;

public class PredicateExample8 {
public static void main(String args[]) {
	Predicate<String> p = Predicate.isEqual("VAISSHNAVI");
	System.out.println(p.test("PRANITHA"));
	System.out.println(p.test("VAISSHNAVI"));
}
}
