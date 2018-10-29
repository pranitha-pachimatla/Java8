import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class BinaryOperatorExample {
public static void main(String args[]) {
	BinaryOperator<String> bo=(s1,s2)->s1+s2;
	System.out.println(bo.apply("Dhrithi", "Vaisshnavi!"));
	IntBinaryOperator ibo =(i1,i2)->i1+i2;
	System.out.println("Sum is: "+ibo.applyAsInt(45, 55));
}
}
