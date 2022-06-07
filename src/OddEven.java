public class OddEven
{
	static boolean isEven(int n)
	{
		return n%2==0;
	}
	public static void main(String[] args)
	{
		int num = 6;
		System.out.println(isEven(num) ? "It is even" : "It is odd");
	}
}
