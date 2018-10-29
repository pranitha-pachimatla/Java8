interface abc{
	default void m1() {
		System.out.println("ABC Class default method");
	}
}
interface xyz{
	default void m1() {
		System.out.println("XYZ Class default method");
	}
}
public class DefaultMethodAmbiguity implements abc,xyz{
	public void m1() {
		//System.out.println("DefaultMethodAmbiguity Class default method");
		abc.super.m1();
	}
 public static void main(String args[]) {
	 DefaultMethodAmbiguity d = new DefaultMethodAmbiguity();
	 d.m1();
 }
}
