
public class NumbersInTwoDimensionPyramid {
	public static void main(String args[]) {
		int i,j,k=1;
		for (i = 0; i <10; i++) {
			for(j=0;j<i;j++) {
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
	}
}