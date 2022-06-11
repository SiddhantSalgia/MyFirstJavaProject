import java.util.*;
import com.globalpayex.college.entities.*;

public class SearchStudent 
{
	public static void main(String[] args)
	{
		HashMap<Integer,Student> map = new HashMap();
		map.put(10, new Student("Sid",'m',10,80));
		map.put(13, new Student("Sam",'m',13,90));
		map.put(17, new Student("Yasha",'f',17,59));
		map.put(19, new Student("Arun",'m',19,56));
		
		Set<Integer> keys = map.keySet();
		System.out.println(keys);
		
		Collection<Student> coll = map.values();
		System.out.println(coll);
		
		Set<Map.Entry<Integer, Student>> entries = map.entrySet();
		
		for(Map.Entry<Integer, Student> entry : entries)
		{
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter roll no.");
		int r = scanner.nextInt();
		
		Student student = map.get(r);
		
		if(student!=null)
		{
			System.out.println(student.getDetails());
		}
		else
		{
			System.out.println("Student not found");
		}*/
	}
}
