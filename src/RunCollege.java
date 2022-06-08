import com.globalpayex.college.entities.Professor;
import com.globalpayex.college.entities.Student;

public class RunCollege 
{
	
	public static void main(String[] args) 
	{
		int i =10;
		Student s1 = new Student("Siddhant",'m',26,80);
		String[] subjects = {"English","History"};
		Professor p1 = new Professor("Rahul",'m',subjects,5000,5);
		System.out.println(p1.getDetails());
	}
}
