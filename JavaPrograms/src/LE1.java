interface Interf1 {
	public void m1();
}

interface sumInterface{
	public void add(int a ,int b);
}

interface stringLengthInterface{
	public int stringLength(String s);
}

interface squareInterface{
	public int squareIt(int x);
}
class LE1 {
	public static void main(String args[]) {
		Interf1 i = () -> System.out.println("Lamda Expression");
		i.m1();
		sumInterface s=(a,b)-> System.out.println("SUM:"+(a+b));	
		s.add(4,5);
		stringLengthInterface l =x->  x.length();
		System.out.println(l.stringLength("HELLO"));
		squareInterface y = z->z*z;
		System.out.println("Square is:"+y.squareIt(10));
	}

}
