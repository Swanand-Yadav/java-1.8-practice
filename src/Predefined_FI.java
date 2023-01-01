import java.util.function.Predicate;

public class Predefined_FI {

	public static void main(String[] args) 
	{
		// For single String...
		Predicate<String> S=str->str.length()>1; // Creating predicate method
		System.out.println(S.test("Swanand")); // Calling predicate method
		
		// For array String...
		String[] s= {"Nag","Somanath","Kumar","Ravi","Yzuvendra"};
		// Predicate<String> p=s2->s2.length()>5; //For checking less than/greater than
		Predicate<String> p=s2->s2.length()%2==0; //For checking even length
		for(String s1:s)
		{
			if(p.test(s1))
			{
				System.out.println(s1);
			}
		}
		
		// Return type for predicate is by default boolean if we not define
		
	}

}
