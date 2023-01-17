
public class Annonyms_without_lambda_expression 
{
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

