//https://www.tutorialspoint.com/java/java_object_classes

public class Dog 
{
   String breed;
   int age;
   String color;

   public Dog()
   {
     // This constructor has no parameter.
   }

   public Dog(String name)
   {
     // This constructor has one parameter, name.
   }

   void barking() {
   }

   void hungry() {
   }

   void sleeping() {
   }
}

public static void main(String []args) {
      // Following statement would create an object myPuppy
      Puppy myPuppy = new Puppy( "tommy" );
   }