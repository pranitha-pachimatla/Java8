interface i1{
	public void m1();
}
public class AnonymousInstanceVariable {
int x=444;
public void m2() {
	i1 i = new i1() {
		int x=333;
		
		public void m1() {
			System.out.println(this.x);
		}
	};
	i.m1();
}
public static void main(String args[]) {
AnonymousInstanceVariable a = new AnonymousInstanceVariable();
a.m2();

}
}
