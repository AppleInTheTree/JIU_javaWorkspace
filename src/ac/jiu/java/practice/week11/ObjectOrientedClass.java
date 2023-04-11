package ac.jiu.java.practice.week11;
import java.lang.*;

public class ObjectOrientedClass extends Course {
    // properties
    private final String name;
    private final boolean  isOnline;
    private final String classRoom;
    private final String lecturer;


    // constructor
    ObjectOrientedClass(String major, String instructor, String name, boolean isOnline, String classRoom, String lecturer) {
        super(major, instructor);

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
    public String toString() {
        return super.toString() + ", name of the course: " + getName() + ", lecturer: " + getLecturer() + ", isOnline: " + isOnline() +
                ", number of students: " + getNumOfStudents() + ", classroom: " + getClassRoom();
    }



}
