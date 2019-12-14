

public class Switch
{ 

	public static void main(String [] args)
	{
        int x = 3;
        int grade;

        while(x > 0)
        {
            
            switch(grade)
            {
            case 10:
                System.out.println("F");
                break;
            
            default:
                System.out.println("Invalid");
            }
            x--;
        }

	}

}