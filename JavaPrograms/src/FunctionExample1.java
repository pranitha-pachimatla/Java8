import java.util.function.Function;

public class FunctionExample1 {
public static void main(String args[]) {
	Function<String, Integer> fe1= s->s.length();
	System.out.println("Length of String is:"+ fe1.apply("Hello World!"));
}
}
