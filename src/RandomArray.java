import java.util.Random;

public class RandomArray 
{
	static <T extends Number> T randomElement(T[] elements)
	{
		Random random = new Random();
		int index = random.nextInt(elements.length);
		return elements[index];
	}
	
	public static void main(String[] args) 
	{
		Double[] floating = {1.1,1.2,1.3,1.4};
		double element = randomElement(floating);
		System.out.println(element);
		
		Integer[] number = {2,4,6,8,10};
		int n = randomElement(number);
		System.out.println(n);
	}
}
