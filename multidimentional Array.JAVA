public class MultiArray
{

     public static void main(String []args)
     {
        int multiArray[][] = {{1,1,1,1},{2,2,2,2}};
        //array [row] [column] = row 0, row 1
        int secondArray[][] = {{1,1,1,1},{2,2,2,2},{43}};
        //array [row] [column] = row 0, row 1, row 2
        
        System.out.println("This is the first array");
        display(multiArray);
        System.out.println("This is the second array");
        display(secondArray);
     }
     
     public static void display (int x[][])
     {
         for (int row = 0; row < x.length; row++)
         {
             for (int column = 0; column < x[row].length; column++)
             {
                 System.out.print(x[row][column]+"\t");
             }
             System.out.println();
         }
     }
     
}