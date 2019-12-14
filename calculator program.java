import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        double fnum, snum, answer;
        String myAnser;

        System.out.println("Enter the first number:");
        fnum = myScanner.nextDouble();
        System.out.println("Enter the second number:");
        snum = myScanner.nextDouble();

        answer = fnum + snum;
        System.out.println("The answer is " + answer);

        System.out.println(answer++);
        System.out.println(answer);

        System.out.println(answer--);
        System.out.println(answer);

        System.out.println("Are you a PUBG player? ");
        myAnser = myScanner.nextLine();
        if ( myAnser == "yes")
        {
            System.out.println("You are cool!");
        }
        else
        {
            System.out.println("You're not kewl!");
        }



    }
}
