import java.util.Arrays;
import java.util.stream.*;
import java.util.*;
public class ListOfOperations 
{
	public static void main(String[] args) 
	{
		
		//Stream API(>=Java 8)
		List<Integer> nos = Arrays.asList(4,1,6,7,9,10,3,5,1,7,9);
		
		Stream<Integer> stream = nos.stream();
		
		//filter is an intermediate operation in a stream
		List<Integer> odds = stream.filter(element -> element%2!=0 && element>3)
						.collect(Collectors.toList());	// collect --> Terminal Operation
		
		System.out.println(odds);
		
		String s = nos.stream()
				.filter(element -> element % 2 == 0 && element > 2)
				.map(element -> element.toString())
				.collect(Collectors.joining(","));
		System.out.println(s);
		
		int[] n = {6,4,5,9,10,3,4,8};
		IntStream intStream = Arrays.stream(n);
		//create a new list consisting of odd numbers more than 3 from the nos list.
		//print the new list.
		Stream<Integer> st = Stream.of(5,4,8,9,2,5);
		
		Stream s1 = Stream.empty();
		/*Create a new list consisting of
		 * elements more than 4 from the nos list 
		 * square up each of the elements
		 * sorted in the descending order. 
		 */
		nos.stream()
			.filter(element -> element > 4)
			.map(element->element=element*element)
			.sorted((element1,element2)->element2.compareTo(element1))
			.collect(Collectors.toList());
		
		/*List<Integer> odd = new ArrayList<>();
		for(Integer num : nos)
		{
			if(num%2!=0 && num>3)
			{
				odd.add(num);
			}
		}*/
		//System.out.println(odd);
		
		//Create a String of elements seperated by comma, consisting of even numbers more than 2 from the no. list
		
	}
}
