import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntSupplier;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntFunction;

public class IntFunctionExample {
public static void main(String args[]) {
	IntFunction<Integer> f= s->s*s;
	System.out.println("Square value is: "+ f.apply(5));
	ToIntFunction<String> t=s->s.length();
	System.out.println("String Length is: "+t.applyAsInt("Pranitha!"));
	IntToDoubleFunction d = s->Math.sqrt(s);
	System.out.println("Square root of number:"+ d.applyAsDouble(25));
	IntConsumer i = x->System.out.println(x*x);
	i.accept(7);
	IntSupplier s =()->(int)(Math.random()*10);
	String otp ="";
	for(int i1=0;i1<6;i1++) {
		otp =otp+s.getAsInt();
	}
	System.out.println("The six digit OTP: "+otp);
}
}
