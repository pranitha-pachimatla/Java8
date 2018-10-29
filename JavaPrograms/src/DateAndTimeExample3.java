import java.time.LocalDate;
import java.time.Period;

public class DateAndTimeExample3 {
public static void main(String args[]) {
	LocalDate joiningDate=LocalDate.of(2017, 10, 26);
	LocalDate today= LocalDate.now();
	Period p=Period.between(joiningDate, today);
	System.out.println("Duration at Nisum: "+p);
	System.out.printf("Duration at Nisum: %d Years %d Months %d Days ",p.getYears(),p.getMonths(),p.getDays());
	System.out.println(); 
	int days=p.getYears()*365+p.getMonths()*30+p.getDays();
	System.out.println("Days at Nisum: "+days);
}
}
