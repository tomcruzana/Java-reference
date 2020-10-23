/*
    • static LocalTime now()
    constructs an object that represents the current date.
    • static LocalTime of(int year, int month, int day)
    constructs an object that represents the given date.
    • int getYear()
    • int getMonthValue()
    • int getDayOfMonth()
    get the year, month, and day of this date.
    • DayOfWeek getDayOfWeek
    Gets the weekday of this date as an instance of the DayOfWeek class. Call getValue to
    get a weekday between 1 (Monday) and 7 (Sunday).
    • LocalDate plusDays(int n)
    • LocalDate minusDays(int n)
    Yields the date that is n days after or before this date.
*/

package com.company;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Calendar {

    public void showCalendar(){
        LocalDate date = LocalDate.now(); //store the complete date now to localdate obj
        int month = date.getMonthValue(); //store the month
        int today = date.getDayOfMonth(); //store the day

        //System.out.println(date);

        date = date.minusDays(today - 1); //set the start of the month which is the first
        DayOfWeek weekday = date.getDayOfWeek(); //ex: FRIDAY
        int value = weekday.getValue(); //get numerical value. ex: 1 = Monday, ... 7 = Sunday

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");

        //System.out.println(value);

        for (int i = 0; i < value; i++) { //Creates spaces before starting the day counter
            System.out.print("   ");
        }

        while (date.getMonthValue() == month){
            System.out.printf("%3d", date.getDayOfMonth());

            if(date.getDayOfMonth() == today){ //if match, then put asterisk *
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1){
                System.out.println();
            }
        }

        if(date.getDayOfWeek().getValue() != 1) System.out.println();
    }
}
