import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

public class CE {
 public static void main(String args[]) {
	 ArrayList<String> l= new ArrayList<String>();
	 l.add("Sunny");
	 l.add("Bunny");
	 l.add("Chinny");
	 l.add("Sunny");
	 System.out.println(l);
	 HashSet<String> h = new HashSet<String>();
	 h.add("Sunny");
	 h.add("Bunny");
	 h.add("Chinny");
	 h.add("Sunny");
	 System.out.println(h);
	 HashMap<String, String> hm = new HashMap<String, String>();
	 hm.put("A", "Apple");
	 hm.put("J", "Juice");
	 hm.put("Pranitha", "Vaisshnavi");
	 hm.put("B", "Bulbul");
	 System.out.println(hm);
	 TreeMap<String, String> tm = new TreeMap<String, String>();
	 tm.put("A", "Apple");
	 tm.put("J", "Juice");
	 tm.put("Pranitha", "Vaisshnavi");
	 tm.put("B", "Bulbul");
	 System.out.println(tm);
 }
}
