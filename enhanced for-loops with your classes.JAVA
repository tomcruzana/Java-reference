public class HelloWorld
{

     public static void main(String []args){
        int bucky[] = {3,4,5,6,7};
        int total = 0;
        
        for (int x: bucky) // syntax: type identifier
        {
            total+=x;
        }
        
        System.out.println(total);
     }
     
}

/*
The enhanced for-loop is a popular feature introduced with the Java SE
platform in version 5.0. Its simple structure allows one to
simplify code by presenting for-loops that visit each element of
an array/collection without explicitly expressing how one goes from
element to element. 
*/