//List out all even numbers into another List.
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsExample1 {
public static void main(String args[]) {
	ArrayList<Integer> l =new ArrayList<Integer>();
	l.add(0);
	l.add(10);
	l.add(20);
	l.add(5);
	l.add(15);
	l.add(25);
	System.out.println("List is: "+l);
	List<Integer> l1= l.stream().filter(I->I%2==0).collect(Collectors.toList());
	System.out.println("Even Numbers List; "+ l1);
	List<Integer> l2= l.stream().map(I->I*2).collect(Collectors.toList());
	System.out.println("Double valued Numbers List; "+ l2);
	ArrayList<String> s =new ArrayList<String>();
	s.add("Vaisshnavi");
	s.add("Pranitha!");
	s.add("Preeti");
	s.add("Hasini");
	s.add("Sravani");
	s.add("Upasana");
	List<String> s1=s.stream().filter(s2->s2.length()>=9).collect(Collectors.toList());
	System.out.println("Filtered Stream"+s1);
	List<String> s2List=s.stream().map(s3->s3.toUpperCase()).collect(Collectors.toList());
	System.out.println("UpperCase Converted Stream"+s2List);
	long lengthOfStream=s.stream().filter(s4->s4.length()>=9).count();
	System.out.println("Count of filtered stream :"+lengthOfStream);
	List<Integer> l3=l.stream().sorted().collect(Collectors.toList());
	System.out.println("Sorted stream :"+l3);
	List<Integer> l4=l.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
	System.out.println("Customised sorted stream :"+l4);
	List<Integer> l5=l.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
	System.out.println("Customised sorted stream :"+l5);
	
	Integer min=l.stream().min((i1,i2)->i1.compareTo(i2)).get();
	System.out.println("Minimum number in the sorted stream :"+min);
	
	Integer max=l.stream().max((i1,i2)->i1.compareTo(i2)).get();
	System.out.println("Maximum number in the sorted stream :"+max);
	
	ArrayList<String> str =new ArrayList<String>();
	str.add("A");
	str.add("BB");
	str.add("CCC");
	System.out.println("Stream Elements are :");
	str.stream().forEach(s5->System.out.println(s5));
	
	System.out.println("Stream Elements are :");
	str.stream().forEach(System.out::println);
	
	Integer[] arr=l.stream().toArray(Integer[]::new);
	System.out.println("Array Elements are :");
	for(int arr1:arr) {
		System.out.println(arr1);
	}
	
	System.out.println("Stream Elements by using of() :");
	Stream<Integer> s6=Stream.of(9,99,999,9999,9999);
	s6.forEach(System.out::println);
	System.out.println("DOUBLE Elements by using of() :");
	Double[] d= {10.1,20.2,30.3,40.4};
	Stream<Double> s7=Stream.of(d);
	s7.forEach(System.out::println);

}
}
