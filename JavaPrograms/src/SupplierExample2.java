import java.util.function.Supplier;

public class SupplierExample2 {
	public static void main(String args[]) {
		Supplier<String> s=()->{
			String[] s1= {"Yukta","Apple","Diya","Mukta","Vaisshnavi"};
			int x= (int) (Math.random()*5);
			return s1[x];
		};
		System.out.println("Random String is: "+ s.get());
		System.out.println("Random String is: "+ s.get());
		System.out.println("Random String is: "+ s.get());
	}
}
