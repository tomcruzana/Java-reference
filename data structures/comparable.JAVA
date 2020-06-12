//Main module
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

class Main{
    public static void main(String[] args) {

        HashSet<Student> studentHashSet = new HashSet<Student>();

        /*
            1. First we declare our hashset.
            2. Since these are object instances, our hashset data structure will not be able to sort it.
            3. We need to convert it into an arraylist for us to use the Collections.sort() method and implement the comparable interface
        */
        studentHashSet.add(new Student("Tom", 2));
        studentHashSet.add(new Student("Harold", 1));

        /*
            4. Declare and convert the hashset into an arraylist
            5. Print the sorted results
        */

        ArrayList<Student> studentArrayList = new ArrayList<Student>(studentHashSet);

        Collections.sort(studentArrayList);

        System.out.println(studentArrayList);
    }
}

//Student module
public class Student implements Comparable<Student>{
    private String name;
    private int grade;

    public Student(String name, int grade) {
        super();
        this.name = name;
        this.grade = grade;
    }

    @Override
    public int compareTo(Student s){ //public int compareTo(T o)
        // This is where you define your own conditions to enable sorting with this object/class
        if(this.grade < s.grade){
            return -1;
        }
        else if(this.grade > s.grade){
            return 1;
        }

        return 0;
    }

    @Override
    public String toString() {
        return String.format("%s/%d", name, grade);
    }
}
