import java.util.ArrayList;
import java.util.function.Predicate;

//to remove null and empty strings from STRING Array
public class PredicateExample4 {
	public static void main(String args[]) {
		String [] names = {"","hi",null,"bye","",null,null,"hello"};
		ArrayList<String> stringWithOutNull = new ArrayList<String>();
		Predicate<String> p =s->s!=null && s.length()!=0;
		for(String s1: names) {
			if(p.test(s1)) {
				//System.out.println(s1);
				stringWithOutNull.add(s1);
			}
		}
		System.out.println(stringWithOutNull);
	}

}
