package ac.jiu.java.practice.week11;
import java.lang.*;

public class Q1_ObjectOrientedClass extends Q1_Course {
    // properties
    private final String name;
    private final boolean isOnline;
    private final String classRoom;
    private final String lecturer;


    // constructor
    Q1_ObjectOrientedClass(String major, String instructor, int credit, String name, boolean isOnline, String classRoom, String lecturer) {
        super(major, instructor, credit);

        this.name = name;
        this.isOnline = isOnline;
        this.classRoom = classRoom;
        this.lecturer = lecturer;
    }
    //
    public String getName() {
        return this.name;
    }
    public boolean isOnline() {
        return this.isOnline;
    }
    public String getClassRoom() {
        return this.classRoom;
    }
    public String getLecturer() {
        return this.lecturer;
    }
    @Override
    public String toString() {
        return super.toString() + ", name of the course: " + getName() + ", lecturer: " + getLecturer() + ", isOnline: " + isOnline() +
                ", number of students: " + getNumOfStudents() + ", classroom: " + getClassRoom();
    }
}
