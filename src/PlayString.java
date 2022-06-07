
public class PlayString 
{
	public static void main(String[] args) 
	{
		String s1 = "Siddhant";
		String s2 ="Salgia";
		String s3 = "Sidd" + "Hant";
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1+" "+s2);
	}
}
