//comparable
//doc: https://www.youtube.com/watch?v=oAp4GYprVHM
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
