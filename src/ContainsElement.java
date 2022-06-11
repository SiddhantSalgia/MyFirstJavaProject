import java.util.*;

import com.globalpayex.college.entities.Student;

public class ContainsElement 
{
	public static void main(String[] args) 
	{
		List<Student> students = Arrays.asList(
				new Student("Siddhant",'m',26,79),
				new Student("Rahul",'m',27,80),
				new Student("Shreya",'f',28,65)
				);
		
		System.out.println("Enter Roll number of student:");
		
		Scanner sc =new Scanner(System.in);
		int r = sc.nextInt();
		
		boolean isFound = students.contains(new Student("NA",'m',r,0));
		System.out.println(isFound ? "Student Found":"Student not found");
		/*for(Student student : students)
		{
			if(student.roll == r)
			{
				System.out.println(student.getDetails());
				return;
			}
		}
		System.out.println("Roll not found");*/
 	}
}
