import java.util.Random;

public class Main
{

     public static void main(String[] args) 
  {
     //https://docs.oracle.com/javase/specs/jls/se7/html/jls-10.html
     //https://stackoverflow.com/questions/1938101/how-to-initialize-an-array-in-java
     
     int myArray[] = new int[10];
     
     
     for (int counter = 0; counter <= myArray.length-1; counter++ )
     {
         myArray[counter] = counter + 2;
         System.out.println(myArray[counter]);
     }
     
     //pre-initialized array
     int sum = 0;
     int myArray2[] = {2,3,4,6,7,8};
     
     for (int counter2 = 0; counter2 < myArray2.length; counter2++ )
     {
         sum += myArray2[counter2];
         
     }
     System.out.println("\n" + sum);
     
  }

    
}