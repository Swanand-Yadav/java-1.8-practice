
/*
 * If the functional interface method returns an object then this case go for constructor reference.
 * Syntax:-   class_name::new 
 * If there are multiple constructor then it will go for matched argument constructor.
 */
class Sample
{
	//Sample(String s) //OR
	Sample()
	{
		System.out.println("Sample class no argument constructor execution...");//OR
		//System.out.println("Sample class constructor execution with argument"+s);
	}
	Sample(String s)
	{
		System.out.println("Sample class constructor execution with argument"+s);
	}
}
interface Inter
{
	//public Sample get(String s); //OR
	public Sample get();
}
public class Constructor_reference 
{
	public static void main(String[] args) 
	{
		Inter i=Sample::new; 
		/*
		 * In above line interface get() method refer Sample class constructor
		 * constructor always going to return an Object
		 */
		Sample s1=i.get();// By this line we can get Sample object. i.get() internally returns a *Sample::new* then automatically sample class constructor executed
		// OR
		//Sample s1=i.get("sharu");
		//Sample s1=i.get("Ravi");
	}

}
