//the ArrayList is part of the collections framework. In this example we will be declaring an ArrayList with no specific data type. Thus it will be storing data as objects.

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args){
        ArrayList words = new ArrayList(); //you can store any data type and the Arraylist will store it as an object

        //add item(s)
        words.add("Hello");
        words.add("World");
        words.add(true);
        words.add(12.0);
        words.add(3);
        words.add(new Pepsi(12, true)); //returning an object

        //remove item(s)
        words.remove("Hello");

        //ArrayList must be casted to a compatible type since by default it stores and returns values as objects.
        String world = (String) words.get(0);
        boolean isTrue = (boolean) words.get(1);
        Object pepsi = words.get(4); //no need to cast this one

        //print list
        System.out.println(world);
        System.out.println(isTrue);
        System.out.println(pepsi);
    }
}

class Pepsi{
    private int oz;
    private boolean isBottled;

    public Pepsi(int oz, boolean isBottled) {
        this.oz = oz;
        this.isBottled = isBottled;
    }

    @Override
    public String toString() {
        return "Pepsi{" +
                " oz=" + oz +
                ", isBottled=" + isBottled +
                " }";
    }
}
