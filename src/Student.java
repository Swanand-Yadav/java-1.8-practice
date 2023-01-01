import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/*
 * Return type : Predicate -> Boolean
 * 				 Function -> Can be anything
 * 				 Consumer -> Void (nothing)
 */
public class Student 
{
	String name;
	int marks;
	
	Student(String name,int marks)
	{
		this.name=name;
		this.marks=marks;
	}
	
	public static void main(String[] args) 
	{
		Function<Student,String> fun=s->{ //Function<Input_type, Return_type>
			int marks=s.marks;
			String grade="";
			if(marks>=80) grade="A[Distinction]";
			else if(marks>=60) grade="B[First class]";
			else if(marks>=50) grade="C[Second class]";
			else if(marks>=35) grade="D[Third class]";
			else  grade="E[Failed]";
			return grade;
		};
		
		Predicate<Student> p=s->s.marks>=60;
			
		Consumer<Student> c=s1->
		{
			System.out.println("Student Name:"+s1.name);
			System.out.println("Student Marks:"+s1.marks);
			System.out.println("Student Grade:"+fun.apply(s1));
			System.out.println("------------------------------------------------------");
		};
		
		Student[] s= {new Student("Sharu",100),
							 new Student("Sunny",65),
							 new Student("Bunny",55),
							 new Student("Chinny",45),
							 new Student("Vinny",25)
		};
		for(Student s1:s)
		{
			c.accept(s1);
		}
		  // OR ( If we want to give some condition then use below one )
		
		/*
		for(Student s1:s)
		{
			if(p.test(s1))
			{
				c.accept(s1);
			}
		}*/
	}
}

/*
public class Student 
{
	String name;
	int marks;
	
	Student(String name,int marks)
	{
		this.name=name;
		this.marks=marks;
	}
	
	public static void main(String[] args) 
	{
		Function<Student,String> fun=s->{ //Function<Input_type, Return_type>
			int marks=s.marks;
			String grade="";
			if(marks>=80) grade="A[Distinction]";
			else if(marks>=60) grade="B[First class]";
			else if(marks>=50) grade="C[Second class]";
			else if(marks>=35) grade="D[Third class]";
			else  grade="E[Failed]";
			return grade;
		};
		
		Predicate<Student> p=s->s.marks>=60;
			
		Student[] s= {new Student("Sharu",100),
							 new Student("Sunny",65),
							 new Student("Bunny",55),
							 new Student("Chinny",45),
							 new Student("Vinny",25)
		};
		
		for(Student s1:s)
		{
			if(p.test(s1))// if i want to make a particular condition if like *greater_than_60* then will true.
			{
				System.out.println("Student Name:"+s1.name);
				System.out.println("Student Marks:"+s1.marks);
				System.out.println("Student Grade:"+fun.apply(s1));
				System.out.println("------------------------------------------------------");
			}			
		}
	}
}
*/
