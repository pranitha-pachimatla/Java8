import java.util.function.Predicate;

public class PredicateExample3 {
	public static void main(String args[]) {
		String[] names= {"krithi","Kalyan","esha","Kavitha","keerthi","laya","geetha"};
		Predicate<String> startsWithK = s->s.charAt(0)=='K';
		System.out.println("Strings starting with K:");
		for(String s1:names) {
			if(startsWithK.test(s1)) {
				System.out.println(s1);
			}
		}
		System.out.println("Strings not starting with K:");
		for(String s1:names) {
			if(startsWithK.negate().test(s1)) {
				System.out.println(s1);
			}
		}
	}
}
