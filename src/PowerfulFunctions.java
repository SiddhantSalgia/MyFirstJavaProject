
public class PowerfulFunctions 
{
	static int nextGenAdd(int...nos)
	{
		int sum=0;
		for(int i=0;i<nos.length;i++)
		{
			sum+=nos[i];
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		System.out.println(nextGenAdd(5,6,7,8));
		System.out.println(nextGenAdd(1,2));
		System.out.println(nextGenAdd(5,9,1));
		System.out.println(nextGenAdd(1,3,7,10));
	}
}
