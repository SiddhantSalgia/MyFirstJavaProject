
public class UseNextGenMainArray
{
	public static void main(String[] args) 
	{
		String[] cars = {"porshe","Audi","BMW"};
		Integer[] numbers = {1,2,3,4,5};
		NextGenArray<String> nextGenArray1 = new NextGenArray(cars);
		NextGenArray<Integer> nextGenArray2 = new NextGenArray(numbers);
	}
}
