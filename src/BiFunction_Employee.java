import java.util.function.BiFunction;

class Emp
{
	int emp_num;
	String emp_name;
	
	Emp(int emp_num,String emp_name)
	{
		this.emp_num=emp_num;
		this.emp_name=emp_name;
	}

	@Override
	public String toString() {
		return "Emp [emp_num=" + emp_num + ", emp_name=" + emp_name + "]";
	}
	
}
public class BiFunction_Employee 
{
	
	public static void main(String[] args) 
	{
		BiFunction<Integer,String,Emp> f=(emp_num,emp_name)->new Emp(emp_num,emp_name);
		//Emp e1=f.apply(10, "Sharu");
		System.out.println(f.apply(10, "Sharu"));
	}

}
