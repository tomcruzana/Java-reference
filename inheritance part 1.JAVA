//Example 1

class Main 
{
  public static void main(String[] args) 
  {
    Food food1 = new Food();
    Chicken chicken1 = new Chicken();

    food1.eat();
    chicken1.eat();
  }
}

class Food
{
  public void eat()
  {
    System.out.printf("I'm eating food right now!\n");
  }
}

class Chicken extends Food //when inheriting from a super class use the extends keyword
{
  public void eat()
  {
    System.out.printf("I'm eating chicken right now!\n");
  }
}

/*
Although example #1 violates the Liskov principle, it still clearly demonstrates the OOP inhertance
*/

//Example 2

abstract class Animal //we will use an abstract class here
{
    private String type;

    public Animal(String type){
        this.type = type;
    }

    public void eat() {
        System.out.println("I'm a " + this.type + " and I'm eating");
    }
}

class Chicken extends Animal //when inheriting from a super class use the extends keyword
{
    public Chicken(String type) {
        super(type);
    }

    //To invoke methods from the super class, use the super keyword. Ex: super.eat();
}
