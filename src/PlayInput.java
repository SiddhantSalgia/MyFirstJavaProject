import java.util.InputMismatchException;
import java.util.Scanner;

public class PlayInput 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Program Started!!!!");
		System.out.println("Enter the number n: ");
		
		try 
		
		{
			int n = scanner.nextInt();
			System.out.println(n%2==0 ? "It is even" : "It is odd");
		} catch(InputMismatchException e)
		{
			System.out.println("Please enter only integer values!");
		}
		
		scanner.close();
		System.out.println("Program ended!!!!");
	}
}
