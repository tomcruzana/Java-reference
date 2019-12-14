import java.util.Scanner;

public class Index
{
    public static void main(String[] args) 
    {
        Scanner userInput = new Scanner(System.in);
        Player playerOne = new Player();

        String name = userInput.nextLine();

        playerOne.showPlayerInformation(name);
    }
}

class Player
{
    public void showPlayerInformation(String name)
    {
        System.out.println("Welcome to the world of darkness, " + name);
    }
}