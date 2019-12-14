//Java Programming Tutorial - 35 - Variable Length Arguments
public class MultiArray
{

     public static void main(String []args)
     {
        System.out.println(average(3,2,2,4,6,21,3,5,12,123,2));
        
     }
     
     public static int average(int...numbers) // this spread operator tells the compiler that you are declaring a variable-length array.
     {
         int total = 0;
         for(int x : numbers)
            total += x;
            
        return total/numbers.length;
     }
     
}