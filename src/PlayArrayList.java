import java.util.ArrayList;

public class PlayArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList<String> cars = new ArrayList<>();
		cars.add("i10");
		cars.add("i20");
		cars.add(1,"porshe");
		System.out.println(cars);
		System.out.println(cars.contains("porshe"));
		
		for(String car : cars)
		{
			System.out.println(car);
		}
		
		/*cars.remove("porshe");
		System.out.println(cars);
		cars.set(0, "Lamborghini");
		System.out.println(cars);
		System.out.println(cars.contains("i20"));
		System.out.println(cars.indexOf("i20"));*/
	}
}
