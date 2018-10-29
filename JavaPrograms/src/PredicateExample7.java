import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.function.Predicate;

class Employee1{
	String designation;
	String name;
	String city;
	Employee1(String designation,String name,String city){
		this.designation = designation;
		this.name=name;
		this.city = city;
		
	}
	@Override
	public String toString() {
		return "Employee1 [designation=" + designation + ", name=" + name + ", city=" + city + "]";
	}
	
}
public class PredicateExample7 {
public static void main(String[] args) {
	Employee1[] e1= {new Employee1("Manager", "abc", "hyderabad"),
			new Employee1("SE", "XYZ", "bangalore"),
			new Employee1("SSE", "sailu", "bangalore"),
			new Employee1("ASE", "preeti", "chennai"),
			new Employee1("TL", "rani", "hyderabad"),
			new Employee1("MANAGER", "rani", "bangalore")};
	Predicate<Employee1> pe1=e->e.designation.equalsIgnoreCase("MANAGER") && e.city.equalsIgnoreCase("Bangalore");
	for(Employee1 e2:e1) {
		if(pe1.test(e2)) {
			System.out.println(e2);
		}
	}
}
}
