import com.abc.geometry.ShapeStatistics;
import com.abc.geometry.entities.Shape;
import com.globalpayex.geometry.entities.*;
public class RunGeometry 
{
	public static void main(String[] args) 
	{
		Shape square = new Square(7);
		ShapeStatistics.print(square);
		
		Shape rectangle = new Rectangle(9,3);
		ShapeStatistics.print(rectangle);
		
		Shape circle = new Circle(7);
		ShapeStatistics.print(circle);
	}
}
