public class CreateStudent 
{	
	public static void main(String[] args) 
	{
		Student studentArray[];
		studentArray = new Student[3];
		studentArray[0] = new Student("Siddhant",'m',23,70); 
		studentArray[1] = new Student("Pratyush",'m',24,80);
		studentArray[2] = new Student("Vibhesh",'m',25,90);
		
		for(int i=0;i<studentArray.length;i++)
		{
			System.out.println(studentArray[i].name+" "+studentArray[i].gender+"\n");
		}
	}
}
