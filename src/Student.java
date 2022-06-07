public class Student 
{
	//instance attributes
	String name;
	char gender;
	int roll;
	double marks;
	
	static int count;
	
	Student()
	{
		this("NA",'m',-1,0.0);
		/*this.name="N/A";
		this.marks=0.0;
		this.roll=-1;
		this.gender='m';*/
	}
	
	Student(String name, char gender, int roll, double marks)
	{
		this.name=name;
		this.gender=gender;
		this.marks=marks;
		this.roll = roll;
		++Student.count;	// also count++ can be used
	}
	
	String getDetails()
	{
		return "Name: "+this.name+"\n"+"Gender: "+this.gender+"\n"+"Roll.no.: "+this.roll+"\n"+"Marks: "+this.marks;
	}
	
	String getGrade()
	{
		char grade;
		if(this.marks >=70 && this.marks<100)
		{
			grade='A';
		}
		else if(this.marks>=60 && this.marks <70)
		{
			grade='B';
		}
		else if(this.marks>=40 && this.marks <60)
		{
			grade='C';
		}
		else if(this.marks<40 && this.marks>=0)
		{
			grade='F';
		}
		else
		{
			grade='I';
		}
	
		return "Grade:"+grade;
	}
	
	static Student newInstance(String name, char gender, int roll, double marks)
	{
		return new Student(name,gender,roll,marks);
	}
}
