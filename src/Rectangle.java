
public class Rectangle 
{
	static int perimeterRectangle(int length, int bredth)
	{
		return 2*(length+bredth);
	}
	public static void main(String[] args) 
	{
		int l1 = 5;
		int l2 = 3;
		int p = perimeterRectangle(l1,l2);
		System.out.println(p);
	}
}
