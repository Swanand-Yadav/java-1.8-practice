
// Method resolution is alternative to lambda expression
/*
 * In below multithreading you are using m1 instead of run method ..but they can be same as if you will keep same arguments then 
 * it will treat as run() if you change any name instead. So we can ignore return type and all.
 * Focus on only arguments of method if exact match with thread class run method
 */

class Test
{
	 //public void m1() 
	public static void m1()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Child Thread");
		}
	}
}

public class Method_instance 
{

	public static void main(String[] args) 
	{
		Runnable r=Test::m1; // Method instance used to reuse the code < Class_name::Method_name > if test class method is static
		//Test t1=new Test(); // If Test class method is not static then create Test class object and use syntax < reference_name::Method_name >
		//Runnable r=t1::m1;
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<5;i++)
		{
			System.out.println("Main Thread");
		}

	}

}
