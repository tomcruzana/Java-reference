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
     
     /*
     The following are helper methods for array formatting
     
     ::print the array values into string
     int[] l = {1,2,3};
     System.out.println(Arrays.toString(l));
     
     ::copies to another array
     String[] msg = {"1", "two"};
     String[] newMsg = Arrays.copyOf(msg, msg.length * 2);
     System.out.println(Arrays.toString(newMsg));
     System.out.println(newMsg.length);
     
     ::sorts the array. It uses the quicksort algorithm
     int[] o = {123, 2, 11, 342};
     Arrays.sort(o);
     System.out.println(Arrays.toString(o));
    
     ::To print out a quick-and-dirty list of the elements of a two-dimensional array, call
     int[][] ma = new int[][] {{1, 2, 3, 4}, {5, 6, 9, 12}};
     System.out.println(Arrays.deepToString(ma));
     */

    
}
