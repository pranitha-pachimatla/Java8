import java.util.Date;
import java.util.function.Supplier;

public class SupplierExample1 {
public static void main(String args[]) {
	Supplier<Date> s = ()->new Date();
}
}
