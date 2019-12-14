/*One way to fetch input from the user!*/
package com.company;
import java.util.Scanner; // first, we need to import the scanner class

public class Main {

    public static void main(String[] args) {
	// second, we need to create an object instance of the scanner. We will be naming it tom

        Scanner tom = new Scanner(System.in); //The system.in argument represents the input device of the computer like the keyboard

        System.out.println(tom.nextLine()); //Now, the object tom will have access to the scanner class properties, and for this line, we will access the nextLine property method

}
