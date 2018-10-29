import java.util.Scanner;
import java.util.function.Predicate;

class SE{
	String name;
	int age;
	boolean isSingle;
	SE(String name,int age, boolean isSingle){
		this.name=name;
		this.age=age;
		this.isSingle=isSingle;
	}
	public String toString() {
		return name;
		
	}
}
public class PredicateExample6 {
	public static void main(String args[]) {
		SE[] list= {new SE("XYZ",56,false),
				new SE("ABC",16,false),
				new SE("DEF",36,true),
				new SE("GHI",26,false)};
		Predicate<SE> pse= se->se.age>=18 && se.isSingle==true;
		System.out.println("Users Not Allowed are:");
		for(SE se1:list) {
			if(pse.negate().test(se1))
			{
				System.out.println(se1);
			}
		}
		
	}
}
