import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

class Employee2{
	String name;
	double salary;
	Employee2(String name,double salary){
		this.name=name;
		this.salary=salary;
	}
}
public class BiConsumerFunctionExample {
public static void main(String args[])
{
	ArrayList<Employee2> l = new ArrayList<Employee2>();
	BiFunction<String, Double, Employee2> b= (n,s)->new Employee2(n,s);
	l.add(b.apply("Pranitha", 19980d));
	l.add(b.apply("Vaisshnavi", 20000d));
	l.add(b.apply("Veda", 999999d));
	l.add(b.apply("Preeti", 454534d));
	BiConsumer<Employee2, Double> c= (e,i)->e.salary=e.salary+i;
	for(Employee2 el: l)
	{
		c.accept(el, 500d);
	}
	
	for(Employee2 el: l)
	{
		System.out.println("Employee Name: "+el.name);
		System.out.println("Employee Salary: "+el.salary);
		System.out.println();
	}
}
}
