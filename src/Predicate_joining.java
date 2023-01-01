import java.util.function.Predicate;

public class Predicate_joining 
{

	public static void main(String[] args) 
	{
		int x[]= {0,5,10,15,20,25,30,35};
		Predicate<Integer> p1=i->i%2==0;
		Predicate<Integer> p2=i->i>10;
		
		// Performing and(), or(), negate()
		System.out.println("the numbers which are even and > 10 are:");
		for(int x1:x)// Each int value x1 in x array...
		{
			if(p1.and(p2).test(x1))
			{
				System.out.println(x1);
			}
			
		}
		
		System.out.println("the numbers which are even or > 10 are:");
		for(int x1:x)
		{
			if(p1.or(p2).test(x1))
			{
				System.out.println(x1);
			}
			
		}
		
		System.out.println("the numbers which are not even are:");
		for(int x1:x)
		{
			if(p1.negate().test(x1))
			{
				System.out.println(x1);
			}
			
		}

	}

}
