import java.util.function.IntPredicate;

public class IntPredicateExample {
public static void main(String args[]) {
	int[] x= {0,11,12,98,23,25,78};
	IntPredicate p =x1->x1%2==0;
	System.out.println("Even Numbers are: ");
	for(int i:x) {
		if(p.test(i)) {
		System.out.println(i);
		}
	}
}
}
