
public class Grade 
{
	static char allotedGrade(int marks)
	{
		char grade;
		if(marks >=70 && marks<100)
		{
			grade='A';
		}
		else if(marks>=60 && marks <70)
		{
			grade='B';
		}
		else if(marks>=40 && marks <60)
		{
			grade='C';
		}
		else if(marks<40 && marks>=0)
		{
			grade='F';
		}
		else
		{
			grade='I';
		}
		
		return grade;
	}
	public static void main(String[] args) 
	{
		int marks = -1;
		System.out.println(allotedGrade(marks));
	}
}
