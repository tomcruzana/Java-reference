/*
Example # 1

One way to fetch input from the user!*/
package com.company;
import java.util.Scanner; // first, we need to import the scanner class

public class Main {

    public static void main(String[] args) {
	// second, we need to create an object instance of the scanner. We will be naming it tom

        Scanner tom = new Scanner(System.in); //The system.in argument represents the input device of the computer like the keyboard

        System.out.println(tom.nextLine()); //Now, the object tom will have access to the scanner class properties, and for this line, we will access the nextLine property method

}


/*
Example #2

* The hasNextInt() method of java.util.Scanner class returns true if the next token in this scanner’s input can be assumed as a Int value of the given radix.
* The scanner does not advance past any input. In case no radix is passed as a parameter
* */

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth:");
        boolean isValidInt = scanner.hasNextInt(); //returns boolean. Checks if int is valid or not

        if(isValidInt){
            int dateOfBirth = scanner.nextInt(); //stores int
            scanner.nextLine(); //make sure to include this line or the system wont ask for the next input
            int age = 2020 - dateOfBirth;//compute age

            System.out.println("Enter your name:");
            String name = scanner.nextLine(); //stores string

            if (age >= 0 && age <= 200) { //int validation to make sure it's not out of range
                System.out.println("Your name is " + name);
                System.out.println("Your age is " + age);
            } else {
                System.out.println("Your date of birth is invalid or out of range.");
            }
        }
        else{
            System.out.println("Can't parse data because it's not a valid number"); //this will fire if user enters an invalid number
        }

        scanner.close(); //close the stream
    }
}


