
interface Interf
{
	public void add( int a,int b);
}

public class Interface_method_ref 
{
	public static void sum(int x,int y)
	{
		System.out.println("The sum:"+(x+y));
	}
	public static void main(String[] args) 
	{
		Interf i=(a,b)->System.out.println("The sum:"+(a+b));
		i.add(10,20);
			//OR - Alternative for the lambda expression
		Interf i1=Interface_method_ref::sum; // If the implementation is already available then go for method reference
		// Above line i1 is referred by *Interface_method_ref* class method internally then 
		//Interface_method_ref will take x and y as a arguments
		i1.add(100, 200);
	}
}

/*
interface Interf
{
	public void add( int a,int b);
}

public class Interface_method_ref 
{
	public static void main(String[] args) 
	{
		Interf i=(a,b)->System.out.println("The sum:"+(a+b));
		i.add(10,20);
	}

}
*/