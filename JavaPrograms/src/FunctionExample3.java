import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;
class Student{
	String name;
	int marks;
	Student(String name,int marks){
		this.name=name;
		this.marks=marks;
	}
}

public class FunctionExample3 {
	public static void main(String args[]) {
		ArrayList<Student> l = new ArrayList<Student>();
		populate(l);
		Predicate<Student> ps =s->s.marks>60;
		Function<Student, String> fe3 = s -> {
			int marks = s.marks;
			if (marks >= 80)
				return "A";
			else if (marks >= 60)
				return "B";
			else if (marks >= 50)
				return "C";
			else if (marks >= 35)
				return "D";
			else
				return "E";
		};
		for (Student s1 : l) {
			System.out.println("Grade of Student:" + s1.name + " " + fe3.apply(s1));
		}
		System.out.println("Students of first Division are:");
		for(Student s2:l) {
			if(ps.test(s2))
				System.out.println("Student information: Name"+s2.name+"Marks="+" "+s2.marks+"Grade "+ " "+fe3.apply(s2));
		}
	}

	private static void populate(ArrayList<Student> l) {
		l.add(new Student("Vidya", 80));
		l.add(new Student("Veda", 60));
		l.add(new Student("Mukta", 35));
		l.add(new Student("Preeti", 25));
		l.add(new Student("Jyoti", 35));
		l.add(new Student("rani", 70));
		l.add(new Student("sita", 50));
		l.add(new Student("divya", 40));

	}
}
