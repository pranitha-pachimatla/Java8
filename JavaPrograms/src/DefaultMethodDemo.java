interface InterfaceWithDefaultMethod{
	default void m1() {
		System.out.println("Default Method");
	}
}
public class DefaultMethodDemo implements InterfaceWithDefaultMethod{
	/*public void m1() {
		System.out.println("Main Mthod m1()");
	}*/
public static void main(String args[]) {
	
	DefaultMethodDemo d = new DefaultMethodDemo();
	
	d.m1();
}
}
