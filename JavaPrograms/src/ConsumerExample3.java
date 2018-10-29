import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student1{
String name;
int marks;
Student1(String name,int marks){
	this.name=name;
	this.marks=marks;
}
public String toString() {
	return "Student1 [name=" + name + ", marks=" + marks + "]";
}

}
public class ConsumerExample3 {
	public static void main(String args[]) {
		ArrayList<Student1> al= new ArrayList<Student1>();
		populate(al);
		Predicate<Student1> p =s->s.marks>60;
		Function<Student1,String> f= s->{
			int marks=s.marks;
			if(marks>=80)
				return "A";
			else if(marks>=60)
				return "B";
			else if(marks>=50)
				return "C";
			else if(marks>=40)
				return "D";
			else
				return "E";
		};
		Consumer<Student1> c = s->{
			System.out.println("Name: "+s.name);
			System.out.println("Marks Obtained: "+s.marks);
			System.out.println("Grade Acheived: "+f.apply(s));
			System.out.println();
		};
		for(Student1 s: al) {
			if(p.test(s)) {
				c.accept(s);
			}
		}
		
	}

	private static void populate(ArrayList<Student1> l) {
		l.add(new Student1("Vidya", 80));
		l.add(new Student1("Veda", 60));
		l.add(new Student1("Mukta", 35));
		l.add(new Student1("Preeti", 25));
		l.add(new Student1("Jyoti", 35));
		l.add(new Student1("rani", 70));
		l.add(new Student1("sita", 50));
		l.add(new Student1("divya", 40));
	}
	
}
