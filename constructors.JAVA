/*
https://stackoverflow.com/questions/30995942/do-constructors-always-have-to-be-public



No, Constructors can be public, private, protected or default(no access modifier at all).

Making something private doesn't mean nobody can access it. It just means that nobody outside the class can access it. So private constructor is useful too.

One of the use of private constructor is to serve singleton classes. A singleton class is one which limits the number of objects creation to one. Using private constructor we can ensure that no more than one object can be created at a time.
*/

class Sample
{
   public Sample() //this is an empty constructor
   {
     //code here
   }
}