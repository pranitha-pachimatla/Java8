interface staticInterface{
	static void m1() {
		System.out.println("Static Method in Interfaces");
	}
}
public class StaticInInterfaces {
	public static void main(String args[]) {
		staticInterface.m1();
	}

}
