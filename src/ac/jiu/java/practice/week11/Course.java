package ac.jiu.java.practice.week11;
import java.util.*;

public class Course {

    // properties
    private String major;
    private String instructor;
    private final ArrayList<String> students;
    private int numOfStudents;

    //constructor
    Course() {
        this.students = new ArrayList<>();
    }

    Course(String major, String instructor) {
        this();
        this.major = major;
        this.instructor = instructor;
    }

    // method
    public String getMajor() {
        return this.major;
    }
    public void setMajor(String major) {
        this.major = major;
    }


    public String getInstructor() {
        return this.instructor;
    }
    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public void addStudents(String students) {
        this.students.add(students);
        numOfStudents++;
    }

    public int getNumOfStudents() {
        return this.numOfStudents;
    }

    public void displayStudents() {
        for(String student : students) {
            System.out.println(student);
        }
    }

    public String toString() {
        return "You made a course which is major: " + getMajor() + ", Leader: " + getInstructor();
    }


}
