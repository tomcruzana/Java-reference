/*
https://stackoverflow.com/questions/3615721/how-to-use-the-tostring-method-in-java
ANYTIME YOU WANNA TURN AN OBJECT INTO A STRING, USE THE toString method
*/
public class Main
{

    public static void main(String[] args)
    {
        Potpie potObject = new Potpie(4,5,6, "ralph");
    }
}

class Potpie
{
    private int month;
    private int day;
    private int year;
    private String ralph;

    public Potpie(int m, int d, int y, String o)
    {
        month = m;
        day = d;
        year = y;
        ralph = o;

        System.out.printf("The constructor for this is %s\n", this); //this is a reference to the current object. Which is the %s
    }

    public String toString()
    {
        return String.format("%d/%d/%d/%s", month, day, year, ralph); //if you remove this method, the compiler will show you gibberish info of the object reference when the constructor is called
    }
}
