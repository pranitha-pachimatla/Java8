import java.util.function.Function;

public class FunctionExample7 {
	public static void main(String args[]) {
		Function<String, String> f1 = Function.identity();
		
		System.out.println(f1.apply("HelloWorldJavaApp!"));
	}
}
