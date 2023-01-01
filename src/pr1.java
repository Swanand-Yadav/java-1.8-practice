
import java.util.LinkedList;
import java.util.Scanner;

public class pr1 { 

	public static void main(String args[]) 
	{ 
		Scanner sc=new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<Integer>(); 

		// For taking input from user...
		for(int k=0;k<2;k++)
		{
			int p = sc.nextInt();
		    list.add(p);
		}
		
		int sum = 0;
		
		// Adding them in a single variable...
		for(int i=0;i<list.size();i++)
		{
			sum=sum+list.get(i);
		}
		
		System.out.println("The new sum is:" + sum); 
	} 
}

