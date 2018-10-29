//m1 and run() method arguments are same so we can use method reference.
public class InstanceMethodReferenceExample {
public static void main(String args[]) {
	InstanceMethodReferenceExample objRef= new InstanceMethodReferenceExample();
	Runnable r = objRef::m1;
		Thread t = new Thread(r);
		t.start();
		for(int i=0;i<=10;i++)
		{
		System.out.println("Main Thread: "+i);
		}
		
}
public void m1() {
	for(int i=0;i<=10;i++)
	{
	System.out.println("Child Thread: "+i);
	}
	}
}
