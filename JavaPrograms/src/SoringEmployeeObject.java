import java.util.ArrayList;
import java.util.Collections;

class Employee{
	int eNo;
	String eName;
	Employee(int eNo, String eName){
		this.eNo = eNo;
		this.eName = eName;	
		}
	public String toString() {
		return "Employee [eNo=" + eNo + ", eName=" + eName + "]";
	}
	
}

public class SoringEmployeeObject {
	public static void main(String args[]) {
		/*Employee e1 = new Employee(100, "Vaisshnavi");
		System.out.println(e1);*/
		ArrayList<Employee> aList = new ArrayList<Employee>();
		aList.add(new Employee(14,"Vaisshnavi"));
		aList.add(new Employee(100,"Veda"));
		aList.add(new Employee(15,"Dhrithi"));
		aList.add(new Employee(8,"Sahasra"));
		aList.add(new Employee(1,"Anaya"));
		aList.add(new Employee(90,"Mukta"));
		//System.out.println(aList);
		//Collections.sort(aList,(e1,e2)->(e1.eNo>e2.eNo)?-1:(e1.eNo<e2.eNo)?+1:0);
		Collections.sort(aList,(e1,e2)->(e1.eNo>e2.eNo)?+1:(e1.eNo<e2.eNo)?-1:0);
		System.out.println(aList);
				
	}
}
