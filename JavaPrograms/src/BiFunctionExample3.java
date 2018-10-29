import java.util.function.BiFunction;

//Calculate monthly salary with Employee and TimeSheet objects by using BiFunction 
class Employees{
	int eNo;
	String eName;
	double dailyWage;
	Employees(int eNo,String eName,double dailyWage){
		this.eNo=eNo;
		this.eName=eName;
		this.dailyWage=dailyWage;
	}
}
class Timesheets{
	int eNo;
	int days;
	Timesheets(int eNo,int days){
		this.eNo=eNo;
		this.days=days;
	}
}

public class BiFunctionExample3 {
	public static void main(String args[]) {
		Employees e =new Employees(1, "PRANITHA", 100);
		Timesheets t=new Timesheets(1, 28);
		BiFunction<Employees, Timesheets, Double> b= (emp,timesheet)->emp.dailyWage*timesheet.days;
		System.out.println("Monthly Salary:"+b.apply(e, t));
	}

}
