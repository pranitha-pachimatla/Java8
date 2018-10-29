interface staticTest{
	public static void m1() {
		System.out.println("Inside Static");
	}
}
public class StaticMethodOverriding {
	/*public static void m1() {
		System.out.println("Static m1() inside StaticMethodOverriding");
	}*/
/*	public void m1() {
		System.out.println("Non Static m1() inside StaticMethodOverriding");
	}*/
	private static void m1() {
		System.out.println("Scope reduction to private m1() inside StaticMethodOverriding");
	}
	public static void main(String args[]) {
		//StaticMethodOverriding st = new StaticMethodOverriding();
		StaticMethodOverriding.m1();
	}

}
