import java.util.function.Consumer;

public class Consumer_accept 
{

	public static void main(String[] args) 
	{
		Consumer<String> c=s->System.out.println(s); //It just consume some value it will never return anything
		c.accept("Swanand");

	}

}
