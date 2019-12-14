/*
This is a basic example of polymorphism.
The children classes must extend the parent class before it can override its methods
*/

class Main {
  public static void main(String[] args) {

    fruits myFruits[] = new fruits[2]; //declares an object array
    myFruits[0] = new apples(); //assigns the first object element to the apples class
    myFruits[1] = new bananas(); //assigns the second object element to the bananas class

    for (int x=0; x<2; ++x)
        {
           myFruits[x].eat();
        }
    
  }
}

class fruits{
  void eat()
  {
    System.out.println("these fruits are great");
  }
}

class apples extends fruits{
  void eat()
  {
    System.out.println("these apples are great");
  }
}

class bananas extends fruits{
  void eat()
  {
    System.out.println("these bananas are great");
  }
}