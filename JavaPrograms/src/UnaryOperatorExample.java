import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
public static void main(String args[]) {
	UnaryOperator<Integer> uo = i->i*i;
	System.out.println("Square is : "+uo.apply(9));
	IntUnaryOperator iuo= i->i*i;
	System.out.println("Square is: "+iuo.applyAsInt(10));
}
}
