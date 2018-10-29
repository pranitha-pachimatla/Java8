import java.util.function.Function;

public class FunctionExample5 {
	public static void main(String args[]) {
		Function<Integer, Integer> f1 = i1->i1+i1;
		Function<Integer, Integer> f2 = i2->i2*i2*i2;
		System.out.println(f1.andThen(f2).apply(2));
		System.out.println(f1.compose(f2).apply(2));
	}
}
