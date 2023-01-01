
//Below code is for java 1.8 
@FunctionalInterface
interface car
{
	public void wheel();		
}
public class pr 
{
	public static void main(String[] args) 
	{
		car d=()-> System.out.println("2 whellers");
		d.wheel();
	}
}

// Below code is for java 1.7 
/*
interface car
{
	public void wheel();
		
}
class Demo implements car
{
	public void wheel() 
	{
		System.out.println("2 whellers");	
	}		
}

public class pr 
{
	public static void main(String[] args) 
	{
		Demo d=new Demo();
		d.wheel();
	}
}
*/