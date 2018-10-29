import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class PredicateExample2 {
	public static void main(String args[]) {
		Predicate<String> ps = s->s.length()>5;
		Predicate<Collection> pc =c->c.isEmpty();
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(2);
		ArrayList<Integer> ai = new ArrayList<Integer>();
		System.out.println("String length greater than 5:"+ps.test("Hello"));
		System.out.println("Collection is empty?"+pc.test(al));
		System.out.println("Collection is empty?"+pc.test(ai));
	}

}
