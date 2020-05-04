class Main 
{
  public static void main(String[] args) 
  {
    System.out.println(Factorial.recursion(5)); //notice that we are not creating an instance because we are invoking a static method. Hence, we use the super class itself to call the recursion method.
  }
}

class Factorial
{
  public static long recursion(long n)
  {
    if(n <= 1) //base case - always have a base case or else your recursion will never end.
    {
      return 1; //returning 1 in programming terms means the output is met or valid
    }
    else
    {
      return n * recursion(n - 1); //recrusive case or also known as the method calling itself.
    }  
  }
}