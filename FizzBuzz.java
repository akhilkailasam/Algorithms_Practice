import java.util.*; 
public class FizzBuzz
  {
	public static void main(String[] args)	
	{
	String buzz =  "Right", fizz = "Point"; //initialise the string variables
	for (int i = 1; i <= 100; i++)
	{
	if (i % 15 == 0) //check if number in position i is divisable by 15, if so don't check other 2 conditions - we don't want a double print
	{
	  System.out.println(buzz + fizz);
	}
	else if (i % 3  == 0 )
	{
	  System.out.println(buzz );
	}
	else if (i % 5== 0)
	{
	  System.out.println(fizz );
	}
      else
	{
	  System.out.println(i );
	}
	}
	}
  }
