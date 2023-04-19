package ac.jiu.java.practice.week11;
import java.util.*;

public class Q1_Course {

    // properties
    private String major;
    private String leader;
    public final ArrayList<String> students;
    private int numOfStudents;
    private int credit;

    //constructor
    public Q1_Course() {
        this.students = new ArrayList<>();
    }

    Q1_Course(String major, String leader, int credit) {
        this();
        this.major = major;
        this.leader = leader;
        this.credit = credit;
    }

    // Accessors and mutators
    public String getMajor() {
        return this.major;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public String getLeader() {
        return this.leader;
    }
    public void setLeader(String leader) {
        this.leader = leader;
    }
    public int getCredit() {
        return this.credit;
    }
    public void setCredit(int credit) {
        this.credit = credit;
    }

    public ArrayList<String> getStudents() {
        return students;
    }

    // other function method
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
        return "You made a course which is major: " + getMajor() + ", Leader: " + getLeader() + ", credit: "
                + getCredit();
    }


}
