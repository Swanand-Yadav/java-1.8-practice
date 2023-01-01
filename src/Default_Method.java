
interface In
{
	public void m1();
	public void m2();
	default void m3()
	{
		System.out.println("This is default mehtod");
	}
}

public class Default_Method implements In
{

	public static void main(String[] args) 
	{
		Default_Method dm=new Default_Method();
		dm.m1();
		dm.m2();
		dm.m3();

	}

	public void m1() {
		
		System.out.println("This is m1 method");
		
	}
	 public void m3()
	{
		System.out.println("overriden default method");
	}
	
	public void m2() {
		
		System.out.println("This is m2 method");
		
	}

}
