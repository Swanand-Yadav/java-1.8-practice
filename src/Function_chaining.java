import java.util.function.Function;

public class Function_chaining 
{

	public static void main(String[] args) 
	{
		Function<Integer,Integer> f1=i->i*2;
		Function<Integer,Integer> f2=i->i*i*i;
		System.out.println(f1.andThen(f2).apply(2)); // It will execute f1 first and then f2
		System.out.println(f1.compose(f2).apply(2)); // Here f2 will execute first.
	}

}
