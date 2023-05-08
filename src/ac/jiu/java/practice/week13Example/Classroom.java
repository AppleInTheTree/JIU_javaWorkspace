package ac.jiu.java.practice.week13Example;
import java.util.*;

public abstract class Classroom {

    // properties
    private String name;

    private ArrayList<String> students ;
    private ArrayList<String> professors;

    //constructors

    protected Classroom() {
        students = new ArrayList<>();
        professors = new ArrayList<>();
    }

    protected Classroom(String name) {
        students = new ArrayList<>();
        professors =new ArrayList<>();
        this.name = name;
    }

    // Accessor and mutator

    public String getName() {
        return this.name;
    }
    public ArrayList<String> getStudents() {
        return this.students;
    }
    public ArrayList<String> getProfessors() {
        return this.professors;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setStudents(String students) {
//        this.students = students;
        this.students.add(students);
    }
    public void setProfessors(String professors) {
        this.professors.add(professors);
    }
    public boolean checkStudent() {
        return this.students.contains("Danial");
    }
    public boolean checkProfessor() {
        return this.professors.contains("Jihoon");
    }
    public abstract String toString();








}
