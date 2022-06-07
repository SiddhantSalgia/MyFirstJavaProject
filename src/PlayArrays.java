
public class PlayArrays 
{
	public static void main(String[] args) 
	{
		String[] cars = new String[4];
		
		String[] fruits = {"mango","apple","banana","cherry"};
		
		//System.out.println(fruits[3]);
		cars[0]="audi";
		cars[1]="mercedes";
		cars[2]="ferrari";
		cars[3]="jaguar";
		
		for(int i=0;i<cars.length;i++)
		{
			System.out.println(cars[i]);
		}
	}
}
