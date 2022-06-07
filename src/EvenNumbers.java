import java.util.*;

public class EvenNumbers 
{
	static String evenSeries(int n)
	{
		String result ="";
		/*while(i<=n)
		{
			if(i%2==0)
			{
				result=result+i;
				
				if(i!=n)
				{
					result=result+',';
				}
			}
			i++;
		}*/
		for(int i=0;i<=n;i++)
		{
			if(i%2==0)
			{
				result=result+i;
				
				if(i!=n)
				{
					result=result+',';
				}
			}
		}
		return result;
	}
	public static void main(String[] args) 
	{
		int n=50;
		System.out.println(evenSeries(n));
	}
}
