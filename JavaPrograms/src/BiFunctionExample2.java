import java.util.ArrayList;
import java.util.function.BiFunction;

class student{
	String name;
	int rollNo;
	student(String name, int rollNo)
	{
		this.name=name;
		this.rollNo=rollNo;
	}
	public String toString() {
		return "student [name=" + name + ", rollNo=" + rollNo + "]";
	}
	
}
public class BiFunctionExample2 {
	public static void main(String args[]) {
		ArrayList<student> sl= new ArrayList<student>();
		BiFunction<String, Integer, student> f =(name,rollNo)->new student(name,rollNo);
		sl.add(f.apply("Pranitha", 18));
		sl.add(f.apply("Vaisshnavi", 1));
		sl.add(f.apply("Veda", 5));
		sl.add(f.apply("Sahsra", 6));
		for(student s: sl) {
			System.out.println(s);
		}
	}

}
