import java.util.ArrayList;
import java.util.function.Function;
class EmployeeSalary{
	private String name;
	private double salary;
	EmployeeSalary(String name,double salary){
		this.name=name;
		this.salary=salary;
	}
	@Override
	public String toString() {
		return "emp [name=" + name + ", salary=" + salary + "]";
	}
	public static void main(String args[]) {
		ArrayList<EmployeeSalary> l = new ArrayList<EmployeeSalary>();
		populate(l);
		Function<ArrayList<EmployeeSalary>, Double> fe4 =emp1->{
			double totalSalary=0;
			for(EmployeeSalary e2: emp1) {
				totalSalary+=e2.salary;
			}
			return totalSalary;
			
		};
		System.out.println(fe4.apply(l));
	}
	

	private static void populate(ArrayList<EmployeeSalary> emp) {
		emp.add(new EmployeeSalary("sitara", 232));
		emp.add(new EmployeeSalary("geetha", 123));
		emp.add(new EmployeeSalary("rani", 1231));
		emp.add(new EmployeeSalary("diya", 111));
		emp.add(new EmployeeSalary("priya", 67));
		
	}
	
}
