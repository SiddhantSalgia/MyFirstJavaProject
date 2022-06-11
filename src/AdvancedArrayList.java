import java.util.List;
import java.util.Arrays;
import java.util.LinkedList;
//import java.util.ArrayList;

public class AdvancedArrayList 
{
	public static void main(String[] args) 
	{
		List<Integer> nums = Arrays.asList(4,1,6,7,8,9,10);
		LinkedList<Integer> llnums = new LinkedList<>(nums);
		
		//to print all the numbers from the numbers list without explicitly using a loop.
		//nums.forEach(n->System.out.println(n));
		
		//to print all the even numbers from the numbers list without using loop
		
		/*nums.forEach(n->{
			if (n%2==0)
			{
				System.out.println(n);
			}
		});*/
		
		//method references.
		//nums.forEach(System.out::println);
		//Set does not have a natural ordering whereas treeset has. 
		
	}
}
