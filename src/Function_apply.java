import java.util.function.Function;

public class Function_apply 
{
	String name;
	int marks;
	
	Function_apply(String name,int marks)
	{
		this.name=name;
		this.marks=marks;
	}
	
	public static void main(String[] args) 
	{
		Function<Function_apply,String> fun=s->{ //Function<Input_type, Return_type>
			int marks=s.marks;
			String grade="";
			if(marks>=80) grade="A[Distinction]";
			else if(marks>=60) grade="B[First class]";
			else if(marks>=50) grade="C[Second class]";
			else if(marks>=35) grade="D[Third class]";
			else  grade="E[Failed]";
			return grade;
		};
		Function_apply[] s= {new Function_apply("Sharu",100),
							 new Function_apply("Sunny",65),
							 new Function_apply("Bunny",55),
							 new Function_apply("Chinny",45),
							 new Function_apply("Vinny",25)
		};
		
		for(Function_apply s1:s)
		{
			System.out.println("Student Name:"+s1.name);
			System.out.println("Student Marks:"+s1.marks);
			System.out.println("Student Grade:"+fun.apply(s1));
			System.out.println("------------------------------------------------------");
		}
	}

}

/*
public class Function_apply {

	public static void main(String[] args) 
	{
		Function<Integer,Integer> f=i->i*i;
		System.out.println(f.apply(4));
		
		Function<String,Integer> fun=s->s.length();
		System.out.println(fun.apply("Sharu"));
		
		Function<String,String> fs=s->s.toUpperCase();
		System.out.println(fs.apply("sharu"));
	}
}
*/