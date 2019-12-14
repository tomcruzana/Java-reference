import java.util.Random;

public class Main
{

     public static void main(String[] args) 
  {
     Random dice = new Random();
     int number;
     int counter = 1;
     
     while(counter <=10)
     {
        number = 1+dice.nextInt(6);
        /*
        You need to add 1+ before the object dice
        because, it will set the random number range
        from 0 - 6. If you remove it, the range would be 0-5
        only
        
        https://docs.oracle.com/javase/7/docs/api/java/util/Random.html
        
        https://stackoverflow.com/questions/20389890/generating-a-random-number-between-1-and-10-java
        */
        counter ++;   
        System.out.println(number + " ");
     }
     
     
  }

    
}