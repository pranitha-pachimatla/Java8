import java.util.ArrayList;
import java.util.function.Consumer;
class Movie{
	String name;
	String hero;
	String herione;
	Movie(String name, String hero,String herione){
		this.name= name;
		this.hero=hero;
		this.herione=herione;
	}
	public String toString() {
		return "Movie [name=" + name + ", hero=" + hero + ", herione=" + herione + "]";
	}
	
}
public class ConsumerExample2 {
	public static void main(String args[]) {
		ArrayList<Movie> m = new ArrayList<Movie>();
		populate(m);
		Consumer<Movie> c =s->{
			System.out.println("Movie Name:"+s.name);
			System.out.println("Hero Name:"+s.hero);
			System.out.println("Herione Name:"+s.herione);
		};
		for(Movie ml:m) {
			c.accept(ml);
		}
		
	}

	private static void populate(ArrayList<Movie> m) {
		m.add(new Movie("Paa", "Abhi", "Vidya"));
		m.add(new Movie("Dangal", "Aamir", "Xyz"));
	}
}
