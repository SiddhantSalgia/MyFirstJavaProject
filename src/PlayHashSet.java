import java.util.List;
import java.util.Arrays;
import java.util.HashSet;

public class PlayHashSet 
{
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,2,3,8,4,9,10,4);
		HashSet<Integer> hashset = new HashSet<>(nums);
		System.out.println(hashset);
		
		HashSet<String> fruits = new HashSet<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherrie");
		
		System.out.println(fruits);
		
		System.out.println(fruits.contains("Apple"));
		
		fruits.remove("Apple");
		
		System.out.println(fruits);
		
	}
}
