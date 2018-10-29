//Product of two integers
import java.util.function.BiFunction;

public class BiFunctionExample1 {
public static void main(String args[]) {
	BiFunction<Integer, Integer, Integer> bf = (a,b)->{return a*b;};
	System.out.println("Product os A and B :"+bf.apply(3, 10));
	System.out.println("Product os A and B :"+bf.apply(35, 10));
}
}
