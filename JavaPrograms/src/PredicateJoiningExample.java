import java.util.function.Predicate;

//number greater than 10 and an even number
public class PredicateJoiningExample {
	public static void m1(Predicate<Integer> p, int[] y) {
		for(int y1:y) {
			if(p.test(y1)) {
				System.out.println(y1);
			}
		}
	}
	public static void main(String args[]) {
		int[] x= {0,5,10,15,20,25,26,30};
		Predicate<Integer> pg =i->i>10;
		Predicate<Integer> pe =i->i%2==0;
		System.out.println("Numbers Greater Than 10 are:");
		m1(pg,x);
		System.out.println("Numbers that are even are:");
		m1(pe,x);
		System.out.println("Numbers Not Greater Than 10 are:");
		m1(pg.negate(),x);
		System.out.println("Numbers Greater Than 10 and also Even are:");
		m1(pg.and(pe),x);
		System.out.println("Numbers Greater Than 10 or also Even are:");
		m1(pg.or(pe),x);
	}

}
