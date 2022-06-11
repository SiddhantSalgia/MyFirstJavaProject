import java.util.*;
import java.util.stream.Collectors;

import com.globalpayex.college.entities.Student;

public class StudentStream 
{
	public static void main(String[] args) {
		List<Student> students = Arrays.asList(
				new Student("Sid",'m',10,80),
				new Student("Sam",'m',13,90),
				new Student("Yasha",'f',17,59),
				new Student("Arun",'m',19,56),
				new Student("Sam",'m',13,90)
				);
		
		String str = students.stream()
				.filter(elements->elements.marks>80)
				.map(element->element.fullName)
				.collect(Collectors.joining(","));
		System.out.println(str);
				
	}
}
