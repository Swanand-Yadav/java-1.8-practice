
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class employees 
{
	String name1;
	int emp_no1;
	
	
	employees(String name, int id)
	{
		this.name1=name;
		this.emp_no1=id;
		
	}
	
	// If we don't implement below toString method then if we try to print any reference variable then it will take object level toString method which have hex hashcode.
	public String toString()
	{
		return name1+" "+emp_no1;
	}
}

public class pr2 {

	public static void main(String[] args) 
	{
		employees e=new employees("sharu",2);
		//System.out.println(e);
		    // OR 
		ArrayList<employees> al=new ArrayList<employees>();
		al.add(new employees("sharu",2));
		al.add(new employees("reshu",1));
		al.add(new employees("bhauvji",6));
		al.add(new employees("me",3));
		System.out.println(al);
		
		Collections.sort(al,(e1,e2)->(e1.emp_no1<e2.emp_no1)?-1:(e1.emp_no1>e2.emp_no1)?1:0);// If we want to sort by id then we can write sorting like that
		System.out.println(al);
		    //OR
//		employee e=new employee("sharu",2);
//		ArrayList<employee> al=new ArrayList<employee>();
//		al.add(e);
		//System.out.println(e);
		
		//If i want to sort based on alphabetical order of emp names
		//s1.compareTo(s2)==> Always used for alphabetical Order.
		Collections.sort(al,(e1,e2)->e1.name1.compareTo(e2.name1));
		System.out.println(al);
	}

}
