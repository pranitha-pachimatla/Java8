import java.util.Scanner;

public class PrimeCheck {
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number:");
		int num = scan.nextInt();
		if(num%2==0)
		{
			System.out.println("Its a Even Number");
		}
		else
		{	
			System.out.println("Its a Odd Number");
		}
		
	}

}
