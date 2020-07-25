package lambda;

public class Palindrome
{
		public static boolean check(String str)
		{
			return str.equals(new StringBuilder(str).reverse().toString());
	    }
	
}
