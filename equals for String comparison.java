//Avoid using == when compairing strings. It's recommended to use the built-in equals method to avoid bugs
public class Main {

    public static void main(String[] args) 
    {
       String a = "apples";
       String b = "tom";
       String c = "TOM";
       
       System.out.println(a.length());
       
       if(a.equals("apples")) //best for strings because the == operator can cause bugs
       {
    	   System.out.println("It == apples!"); 
       }
       
       if(b.equalsIgnoreCase(c)) 
       {
    	   System.out.println("Toms match!"); 
       }
       else
       {
    	   System.out.println("Doesn't match!");
       }
    }
}
