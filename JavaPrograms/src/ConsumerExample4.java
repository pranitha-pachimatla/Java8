import java.util.function.Consumer;

class MovieResults
{
	String name;
	String result;
	MovieResults(String name, String result) {
		this.name=name;
		this.result=result;
	}
}
public class ConsumerExample4 {
public static void main(String args[]) {
	Consumer<MovieResults> c1=m->System.out.println("Movie Name:"+m.name);
	Consumer<MovieResults> c2=m->System.out.println("Movie Result:"+m.result);
	Consumer<MovieResults> c3=m->System.out.println("Movie Information: Movie Name: "+m.name+" Movie Result: "+m.result);
	MovieResults m1= new MovieResults("Paa","SuperHit");
	c1.andThen(c2).andThen(c3).accept(m1);
	
}
}
