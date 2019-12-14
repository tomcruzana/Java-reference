import java.util.Scanner; //utilizes the scanner utility

class Main 
{
  

  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in); //object instance of the Scanner class

  int total = 0; //the sum of all grades
  int grade, average; /*Java does not have uninitialized variables. Fields of classes and objects that do not have an explicit initializer and elements of arrays are automatically initialized with the default value for their type (false for boolean, 0 for all numerical types, null for all reference types).*/
  int counter = 0;

  while (counter < 10) //will ask for input untill the user enters the 10th integer input
  {
    grade = input.nextInt(); //allows you to input an integer

    total = total + grade; 

    counter++;
  }

  average = total / 10;
    System.out.println("Your average is " + average);
  }
}