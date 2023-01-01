import java.util.Arrays;
import java.util.List;

public class for_each_method 
{
	public static void main(String[] args) 
	{
		List<Integer> elements=Arrays.asList(4,5,6,7,8,9);
		
		System.out.print("Enhanced Loop: ");
		for(int values:elements)
		{
			System.out.print(values+", ");
		}
		
		System.out.println();
		System.out.print("Normal Loop: ");
		for(int i=0;i<elements.size();i++)
		{
			System.out.print(elements.get(i)+", ");
		}
		
		System.out.println();
		System.out.print("forEach Method from java 1.8: ");
		elements.forEach(arr->System.out.print(arr+", "));
	}
}

/*
 * Internal loop: forEach loop
 * External loop: Normal and enhanced loop
*/