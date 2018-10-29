import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class MyComparator implements Comparator<Integer>
{
	public int compare(Integer i1, Integer i2) {
	return(i1>i2)?-1:(i1<i2)?1:0;
		
	}
	
}
public class CEListSorting {
	public static void main(String args[])
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(5);
		al.add(0);
		al.add(20);
		al.add(1);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		/*Collections.sort(al, new MyComparator());
		System.out.println(al);*/
		//Comparator<Integer> mc = ( i1, i2)->{return(i1>i2)?-1:(i1<i2)?1:0;};
		//Collections.sort(al, mc);
		Collections.sort(al,( i1, i2)->{return(i1>i2)?-1:(i1<i2)?1:0;});
		System.out.println("Lambda Expression:"+al);
	}
}
