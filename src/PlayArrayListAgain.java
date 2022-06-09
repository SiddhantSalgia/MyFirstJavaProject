import java.util.ArrayList;
import java.util.Comparator;

public class PlayArrayListAgain 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> marks = new ArrayList<>();
		marks.add(59);
		marks.add(55);
		marks.add(68);
		marks.add(45);
		marks.add(21);
		marks.add(29);
		/*class DescendingComparator implements Comparator<Integer>
		{
			@Override
			public int compare(Integer o1, Integer o2)
			{
				return o2.compareTo(o1);
			}
		}
		System.out.println(marks);
		marks.sort(null);
		System.out.println(marks);
		marks.sort(new DescendingComparator());
		System.out.println(marks);*/
		marks.sort((o1,o2)->o2.compareTo(o1));
		System.out.println(marks);
	}
}
