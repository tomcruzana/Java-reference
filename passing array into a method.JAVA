public class HelloWorld
{

     public static void main(String []args)
     {
        int colors[] = {1,3,56,7,2};
        
        change(colors);
        
        
     }
     
     public static void change (int x[])
     {
         for (int counter = 0; counter<x.length; counter++)
         {
             
             System.out.println(x[counter] += 5); //adds 5 to each element of the colors array.
         }
     }
}