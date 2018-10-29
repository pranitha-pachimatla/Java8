import java.util.TreeMap;

public class CEMapSortingWithLambda {
public static void main(String args[])
{
	//TreeMap will sort according to ascending of keys
	TreeMap<Integer, String> t = new TreeMap<Integer, String>((i1,i2)->(i1>i2)?-1:(i1<i2)?+1:0);
	t.put(100, "A");
	t.put(50, "B");
	t.put(1300, "A");
	t.put(5, "A");
	t.put(20, "A");
	t.put(700, "A");
	t.put(150, "A");
	System.out.println(t);
}
}
