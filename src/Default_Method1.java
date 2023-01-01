
interface Left
{
	default void m1()
	{
		System.out.println("Left method");
	}
}
interface Right
{
	default void m1()
	{
		System.out.println("Right method");
	}
}
	
public class Default_Method1 implements Left,Right
{
	
	public static void main(String[] args) 
	{
		Default_Method1 dm=new Default_Method1();
		dm.m1();

	}

	
	public void m1() 
	{
		//If we want to call specific interface method then... below 
		//Left.super.m1();// This solution is applicable only for interface level not class level.
		   // OR
		System.out.println("My own implimenation");
	}

}
