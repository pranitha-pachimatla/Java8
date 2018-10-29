import java.util.TreeSet;

public class CESetSortinWithLambda {
	public static void main(String args[]) {
	TreeSet<Integer> t = new TreeSet<Integer>((i1,i2)->(i1>i2)?-1:(i1<i2)?+1:0);
	t.add(20);
	t.add(2);
	t.add(30);
	t.add(5);
	t.add(10);
	t.add(8);
	t.add(45);
	t.add(5);
	System.out.println(t);
	}

}
