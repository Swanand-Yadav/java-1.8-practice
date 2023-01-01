
//Using lambda expression.
public class Annonyms {

	public static void main(String[] args) 
	{
		Runnable r=()->{
			for(int i=0;i<5;i++)
			{
				System.out.println("Child Thread");
			}
				
		};	
		
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<5;i++)
		{
			System.out.println("Main Thread");
		}
	}
}

/*

//Using without lambda expression with anonymous class
public class Annonyms {

	public static void main(String[] args) 
	{
		Runnable r=new Runnable()
		{ // This anonymous class implements Runnable interface.
			public void run()
			{
				for(int i=0;i<5;i++)
				{
					System.out.println("Child Thread");
				}
			}
		};
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<5;i++)
		{
			System.out.println("Main Thread");
		}
	}
}

*/