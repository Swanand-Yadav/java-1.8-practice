import java.util.ArrayList;
import java.util.function.Predicate;

public class Employee 
{
	String name;
	double Salary;

	Employee(String name,double salary)
	{
		this.name=name;
		this.Salary=salary;
	}

	public static void main(String[] args) 
	{
		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(new Employee("Durga",2000.05));
		al.add(new Employee("Mohan",7800.25));
		al.add(new Employee("Roshani",800.09));
		
		Predicate<Employee> p=e->e.Salary>3000;
		for(Employee e1:al)
		{
			if(p.test(e1)) // OR if(e.Salary>3000) But use p.test(e1) if too many conditions
			{
				System.out.println(e1.name+":"+e1.Salary);
			}
		}
	}

}
