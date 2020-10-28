/*
Comparator

Comparable and comparator both are an interface that can be used to sort the elements of the collection. 
Comparator interface belongs to java.util package while comparable belongs to java.lang package. 
Comparator interface sort collection using two objects provided to it, whereas comparable interface compares" this" refers to the one objects provided to it. 

Note: Kung titingnan mo, dalawa yung params ng method compare ng Comparator interface. So that means, 2 objects na kahit ano ang pwedeing ikumpara.
On the otherhand, yung compareTo method ng Comparable interface ay meroon lamang isang params which is para sa other object na iccompare sa current (this) object.

Comparable vs. Comparator
doc: https://www.youtube.com/watch?v=oAp4GYprVHM

Read more here:
https://www.tutorialspoint.com/difference-between-comparable-and-comparator-in-java
*/
package com.company;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        player1.name = "Tom";
        player2.score = 100;
        player1.name = "Harold";
        player2.score = 200;

        Checker c = new Checker();
        System.out.println(c.compare(player1, player2));
    }
}

class Checker implements Comparator<Player>{
    /* the compaarator logic in a nutshell
    * x.compareTo(y):
    *   negative value: if x < y (x should appear first)
    *   zero if x == y
    *   positive value: if x > y (x should appear second)
    * */

    //shortcut alt implementation with same results above
    public int compare(Player a, Player b){
        if(a.score == b.score){
            return a.name.compareTo(b.name);
        }
            return b.score - a.score;
    }
}

class Player{
    public String name;
    public int score;
}
