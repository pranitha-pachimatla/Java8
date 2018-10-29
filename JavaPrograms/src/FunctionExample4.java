import java.util.function.Function;

public class FunctionExample4 {
public static void main(String args[]) {
	Function<String, String> f1 = s1->s1.toUpperCase();
	Function<String, String> f2 = s2->s2.substring(0, 9);
	System.out.println(f1.andThen(f2).apply("HelloWorldJavaApp!"));
	System.out.println(f1.compose(f2).apply("HelloWorldJavaApp!"));
}
}
