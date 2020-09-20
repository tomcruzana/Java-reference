//comparable
//doc: https://www.youtube.com/watch?v=oAp4GYprVHM
package com.company;
import java.util.*;

class Main {
    public static void main(String[] args) {
        ArrayList<SkateVideos> SkateMovielist = new ArrayList<>();
        SkateMovielist.add(new SkateVideos(2021, "Sorry Flip", 4.8));
        SkateMovielist.add(new SkateVideos(2003, "Vans of the Wall", 3.2));
        SkateMovielist.add(new SkateVideos(2020, "Forty-four Skate", 5.0));

        Collections.sort(SkateMovielist);

        for(SkateVideos skateMovie : SkateMovielist){
            System.out.printf("%s %n %f %n %d %n%n",
                    skateMovie.getName(),
                    skateMovie.getRating(),
                    skateMovie.getYear()
            );
        }
    }
}

class SkateVideos implements Comparable<SkateVideos>{

    private int year;
    private String name;
    private double rating;

    //This is where you implement the logic
    @Override
    public int compareTo(SkateVideos o) {
        //this > obj then return a positive number
        //this < obj then return a negative number
        //this == obj then return 0
        // with a higher value, the obj will get ordered higher!

        if(this.getYear() > o.getYear()){
            return 1;
        }
        else {
            return -1;
        }
    }

    public SkateVideos(int year, String name, double rating) {
        this.year = year;
        this.name = name;
        this.rating = rating;
    }

    // Getter methods for accessing private data
    public double getRating() { return rating; }
    public String getName()   { return name; }
    public int getYear()      { return year; }
}
