import java.time.LocalDate;
import java.time.LocalTime;

public class DateAndTimeExample1 {
public static void main(String args[]) {
	LocalDate date = LocalDate.now();
	System.out.println("Today's date: "+date);
	LocalTime time = LocalTime.now();
	System.out.println("Time : "+time);
	System.out.println("Current Day :"+date.getDayOfMonth());
	System.out.println("Current Month :"+date.getMonth());
	System.out.println("Current Year :"+date.getYear());
	
	//own format of displaying date
	int dd=date.getDayOfMonth();
	int mm=date.getMonthValue();
	int yy=date.getYear();
	System.out.printf("%d-%d-%d",dd,mm,yy);
	System.out.println();
	
	//own format of displaying time
	int h=time.getHour();
	int m=time.getMinute();
	int s=time.getSecond();
	int n=time.getNano();
	System.out.printf("%d:%d:%d:%d",h,m,s,n);
}
}
