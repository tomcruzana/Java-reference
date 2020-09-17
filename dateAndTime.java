package com.company;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class

public class Main {
    public static void main(String[] args) {
        LocalDate myDate = LocalDate.now();
        System.out.println(myDate); //display current date

        LocalTime myTime = LocalTime.now();
        System.out.println(myTime); //display current time

        LocalDateTime myDateAndTime = LocalDateTime.now();
        System.out.println(myDateAndTime); //display current date and time

        DateTimeFormatter myFormattedDateAndTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); //initialize the format
        String formattedDate = myDateAndTime.format(myFormattedDateAndTime);
        System.out.println("After formatting: " + formattedDate);

    }
}

//doc: https://www.w3schools.com/java/java_date.asp
