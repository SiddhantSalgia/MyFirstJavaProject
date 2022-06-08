import com.globalpayex.college.entities.Professor;
import com.globalpayex.college.entities.Student;

public class RunCollege 
{
	
	public static void main(String[] args) 
	{
		int i =10;
		Student s1 = new Student("Siddhant",'m',26,80);
		String[] subjects = {"English","History"};
		Professor p1 = new Professor("Rahul",'m',subjects);
		/*System.out.println(s1.fullName);
		System.out.println(p1.fullName);
		System.out.println(s1.marks);
		System.out.println(p1.gender);*/
		
		System.out.println(i);
		System.out.println(s1+"\n");										//	Student -> CollegeUser -> Object	
		System.out.println(p1);
		/*System.out.println(s1.getDetails());
		System.out.println("\n");
		System.out.println(p1.getDetails());*/
	}
}
