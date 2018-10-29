import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneIdExample {
public static void main(String args[]) {
	ZoneId zone = ZoneId.systemDefault();
	System.out.println("Default Zone:"+zone);
	ZoneId LA =ZoneId.of("America/Los_Angeles");
	System.out.println("America Zone:"+LA);
	ZonedDateTime zt=ZonedDateTime.now(LA);
	System.out.println("America current date & time:"+zt);
}
}
