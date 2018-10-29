interface InterfExample{
	public void m1();
}
public class LamdaInstanceVariable {
	int y=444;
public void m2() {
	InterfExample i = () ->{
		int y=333;
		System.out.println(this.y);	
		};
	i.m1();
	}
public static void main (String args[]) {
	LamdaInstanceVariable l = new LamdaInstanceVariable();
	l.m2();
}

}
