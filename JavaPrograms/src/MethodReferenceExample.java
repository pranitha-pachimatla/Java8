interface doublecolon{
	public void m1();
}
public class MethodReferenceExample {
public static void main(String args[]) {
	doublecolon i=MethodReferenceExample::m2;
	i.m1();
}
public static void m2() {
	System.out.println("Method Implemnattion by Method Reference");
}
}
