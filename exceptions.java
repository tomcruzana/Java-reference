
//https://www.geeksforgeeks.org/try-catch-throw-and-throws-in-java/
import java.util.*; 

public class Main 
{ 
	public static void main(String[] args)
	{ 
		calc obj = new calc();
		obj.add();
	} 
} 

class calc
{
	
	private int n1, n2;
	Scanner input;
	
	public calc()
	{
		//empty constructor
	}
	
	public void add()
	{
		try 
		{
			
				input = new Scanner(System.in);
				n1 = input.nextInt();
				n2 = input.nextInt();
				System.out.println(n1 / n2);
			
		}
		catch (ArithmeticException e)
		{
			System.out.println(e + " You can't divide 0, bitch!");
		}
		
		finally 
		{ 
	        System.out.println("I am in final block");  //optional. The final block runs no matter what  
		} 
		
		
	}
	
}
