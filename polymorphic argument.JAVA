/*
Side note: 
Was reading one of the comments in the forums about Polymorphism and why and when we need to use, so here is a good explanation, hope that helps :
Suppose you work for a company that sells books. So you make a very nice class called "Book" that handles everything that you need to know about a book. You write all sorts of classes for billing, shipping, creating invoices, all using the Book class. One day your boss comes in and says, "Great news! The company is expanding and we are selling CD's now!" Not great news because now you have to change every class that uses Book to also use CD. But what if you had originally created an interface (or an abstract class) called "ThingWeSell", and Book implemented this interface. Then you could have written all your shipping, invoicing, etc classes to use that interface instead of Book. Now all you would have to do is create a new class called CompactDisc which implements the ThingWeSell interface. Because of polymorphism, all of the other classes could continue to work without change!
*/

class Main {
  public static void main(String[] args) {
      fatty tom = new fatty();
      fruits myFruits = new fruits();
      apples myApples = new apples();

      tom.digest(myFruits);
      tom.digest(myApples);
    
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

class fatty{ //this is the core of this topic
  public void digest(fruits x) //create food class obj and make it as an arg
  {
    x.eat();
  }
}