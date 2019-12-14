//Read more: http://www.c4learn.com/java/java-passing-object-as-parameter-to-method/

class Main {
  public static void main(String[] args) 
  {
    Person person1 = new Person("Microsoft","Rob");
    person1.showPersonInfo(person1);
  }
}

class Person
{
  private String companyName;
  private String name;
  public Person(String p, String n)
  {
    this.companyName = p;
    this.name = n;
  }

  public void showPersonInfo(Person p)
  {
    System.out.printf("%s is %s's company.", p.companyName, p.name);
  }

}