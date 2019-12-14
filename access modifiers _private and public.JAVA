//Java Programming Tutorial - 35 - Variable Length Arguments
public class Access
{
    

     public static void main(String []args)
     {
       Gov myGov = new Gov();
       int x = myGov.chicken(10);
       System.out.println(x);
     }
     
    
}

class Gov
{
    private int governmentData;
    
    public int chicken(int x)
    {
        governmentData = 90;
        return x * 2 + 30 * governmentData;
    }
}


/*
Note:
There can only be one public class per .java file, as public classes must have the same name as the source file. One Java file can consist of multiple classes with the restriction that only one of them can be public.
*/

//more docs: https://javarevisited.blogspot.com/2012/10/difference-between-private-protected-public-package-access-java.html
//https://www.quora.com/Can-we-keep-more-than-one-class-in-a-single-java-file