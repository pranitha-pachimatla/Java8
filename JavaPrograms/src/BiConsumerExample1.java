import java.util.function.BiConsumer;

public class BiConsumerExample1 {
public static void main(String args[])
{
	BiConsumer<String, String> b =(s1,s2)->System.out.println(s1.concat(s2));
	b.accept("Dhrithi", "Vaisshnavi!");
	}

}
