import java.util.Date;
import java.util.function.Supplier;

//Generating random OTP 
public class Supplier_get 
{

	public static void main(String[] args) 
	{
		Supplier<String> s=()->{
			String otp="";
			for(int i=0;i<6;i++)
			{
				otp=otp+(int)(Math.random()*10); // Logic of generating random otp - we typecasted to int bcoz we need int values only
			}
			return otp;
		};
		System.out.println(s.get());
	}
}

/*
public class Supplier_get 
{

	public static void main(String[] args) 
	{
		Supplier<Date> s=()->new Date();
		System.out.println(s.get());

	}

}
*/