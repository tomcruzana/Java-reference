/*
#Classes to hold objects
#Polimorphism
*/

class Main {
  public static void main(String[] args) {
      //creates instances of the classes
      AnimalList ALO = new AnimalList();
      Dog d = new Dog();
      Fish f = new Fish();

      //invokes the add method of the AnimalList class
      ALO.add(d); //adds the friggen dog object
      ALO.add(f); //adds the friggen fish object
    
  }
}

class AnimalList 
{
  private Animal[] theList =  new Animal[5]; //creates a private array of the Animal instance object
  private int i = 0;
  public void add(Animal a)
  {
    if(i<theList.length) //checks the lengnth of the theList array (i<5)
    {
        theList[i]=a; //assigns an instance of the Animal class in each element of the theList
        System.out.println("Animal added at index " + i); //print output
        i++;
    }
  }
}

class Animal 
{}

class Dog extends Animal
{}

class Fish extends Animal
{}

