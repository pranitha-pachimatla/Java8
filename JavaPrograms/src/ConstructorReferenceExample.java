class Sample{
	Sample(){
		System.out.println("Sample Constructor Execution");
	}
}
interface sampleInterface{
	public Sample get();
}
public class ConstructorReferenceExample {
public static void main(String args[]) {
	sampleInterface si= ()->{
		Sample s = new Sample();
		return s;};
		Sample s1=si.get();
	sampleInterface siConstructorReference=Sample::new;
	Sample s = siConstructorReference.get();
}
}
