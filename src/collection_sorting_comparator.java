
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors; 

//Using java 1.8

public class collection_sorting_comparator { 

	public static void main(String args[]) 
	{ 
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(20);
		al.add(4);
		al.add(47);
		al.add(65);
		al.add(0);
		
		System.out.println(al);
		
		Comparator<Integer> c=(i1,i2)->(i1<i2)?+1:(i1>i2)?-1:0;
		
		Collections.sort(al,c);
		System.out.println(al);
		//al.stream().forEach(System.out::println);
		//List<Integer> l2=al.stream().filter(i->i%2==0).collect(Collectors.toList()); //If we want to print even numbers.
		//System.out.println(l2);
	} 
}





/*
// Using java 1.7

class MyComparator implements Comparator<Integer>
{
	public int compare(Integer i1, Integer i2)
	{
		return (i1<i2)?+1:(i1>i2)?-1:0; // Ternary operator
		
			//OR	
			 
		if(i1<i2)
		{
			return +1;
		}
		else if(i1>i2)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	// If we change + and - sign then it will reflect as a ascending or descending order or vice versa
	
}
public class collection_sorting_comparator { 

	public static void main(String args[]) 
	{ 
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(20);
		al.add(4);
		al.add(47);
		al.add(65);
		al.add(0);
		
		System.out.println(al);
		
		Collections.sort(al,new MyComparator());
		System.out.println(al);
		
		Collections.sort(al); // without taking consideration of comparator
		System.out.println(al);
	} 
}
*/