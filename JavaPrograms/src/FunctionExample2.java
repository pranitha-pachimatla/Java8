import java.util.function.Function;

public class FunctionExample2 {
	public static void main(String args[]) {
		Function<String, String> fe2 = s -> s.replaceAll(" ", "");
		System.out.println("String without spaces:" + fe2.apply("How are you now ? !"));

		Function<String, Integer> fe3 = s -> s.length() - s.replaceAll(" ", "").length();
		System.out.println("Number of spaces present in given string:" + fe3.apply("How are you now ? !"));
	}
}
