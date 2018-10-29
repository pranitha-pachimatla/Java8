import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;
class EmployeeList{
	String name;
	double salary;
	EmployeeList(String name,double salary){
		this.name = name;
		this.salary = salary;
	}
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	
}
//Salary INCREMENT whose salary is <3500 by 477
public class PredicateAndFunctionExample {

	public static void main(String args[]) {
		ArrayList<EmployeeList> e = new ArrayList<EmployeeList>();
		populate(e);
		System.out.println("Before Increment:");
		System.out.println(e);
		Predicate<EmployeeList> pel= emp->emp.salary<3500;
		Function<EmployeeList, EmployeeList> pf = emp1->{emp1.salary=emp1.salary+477;
		return emp1;};
		ArrayList<EmployeeList> el = new ArrayList<EmployeeList>();
		for(EmployeeList emplist: e) {
			if(pel.test(emplist)) {
				el.add(pf.apply(emplist));
			}
		}
		System.out.println("After Increment:");
		System.out.println(el);
	}
	public static void populate(ArrayList<EmployeeList> e) {
		e.add(new EmployeeList("sitara", 2320));
		e.add(new EmployeeList("geetha", 6789));
		e.add(new EmployeeList("rani", 566));
		e.add(new EmployeeList("diya", 999));
		e.add(new EmployeeList("priya", 3445));
	}

}
