
//Check documentation first! Important!
//https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html

public class Switcheroo
{ 

	public static void main(String [] args)
	{
        int month = 2;
        String monthString;
        
        switch(month)
        {
        case 1 : monthString = "January";
            System.out.println(monthString);
            break;
            
        case 2 : monthString = "February";
            System.out.println(monthString);
            break;
            
        case 3 : monthString = "March";
            System.out.println(monthString);
            break;

        default:
            System.out.println("Invalid");
        }
	}

}