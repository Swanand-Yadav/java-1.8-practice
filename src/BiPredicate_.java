import java.util.function.BiPredicate;

public class BiPredicate_ 
{

	public static void main(String[] args) 
	{
		BiPredicate<Integer,Integer> p=(a,b)->(a+b)%2==0; // BiPredicate will take 2 arguments normal will take 1
		System.out.println(p.test(5, 4));
		System.out.println(p.test(10, 20));
	}

}
