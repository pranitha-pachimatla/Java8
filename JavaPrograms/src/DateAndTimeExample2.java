import java.time.LocalDateTime;
import java.time.Month;

public class DateAndTimeExample2 {
public static void main(String args[]) {
	LocalDateTime dt= LocalDateTime.now();
	System.out.println("Date&Time :"+dt);
	System.out.println(dt.getChronology());
	int dd=dt.getDayOfMonth();
	int mm=dt.getMonthValue();
	int yy=dt.getYear();
	System.out.printf("%d-%d-%d",dd,mm,yy);
	System.out.println();
	int h=dt.getHour();
	int m=dt.getMinute();
	int s=dt.getSecond();
	int n=dt.getNano();
	System.out.printf("%d:%d:%d:%d",h,m,s,n);
	System.out.println();
	LocalDateTime dt1= LocalDateTime.of(2017,10,26,12,45);
	System.out.println("My Joining Date is: "+dt1);
	LocalDateTime dt2= LocalDateTime.of(2017,Month.OCTOBER,26,12,45);
	System.out.println("My Joining Date is: "+dt2);
	System.out.println("After six months: "+dt2.plusMonths(6));
	System.out.println("Befor six months: "+dt2.minusMonths(6));
}
}
