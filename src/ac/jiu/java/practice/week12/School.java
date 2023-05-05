package ac.jiu.java.practice.week12;
import java.util.*;

public class School extends Building implements Security {
    private final ArrayList<String> students;
    private final ArrayList<String> professors;
//    private final int numOfClassRoom;

    School() {
        students = new ArrayList<>();
        professors =new ArrayList<>();
    }


    School(String name, double height, double width, int numOfFloors) {
        super(name, height, width, numOfFloors);
        students = new ArrayList<>();
        professors =new ArrayList<>();
//        this.numOfClassRoom = numOfClassRoom;
    }

    // accessor & mutator
    public ArrayList<String> getStudents() {
        return students;
    }
    public ArrayList<String> getProfessor() {
        return professors;
    }
    // method
    public void setStudents(String student) {
        this.students.add(student);
    }
    public void setProfessors(String professor) {
        this.professors.add(professor);
    }
    @Override
    public void securityCheck() {
        System.out.println("There is a one security office in our school");
    }
    @Override
    public void securityName() {
        System.out.println("Name is Minjoo");
    }

    @Override
    public int getTotalPeople() {
        return this.students.size() + this.professors.size();
    }
    @Override
    public String toString() {
        return "Name of the Building is " + getName() + ", height : " + getHeight() +
                ", width: " + getWidth() + ", number of floors is: " + getNumOfFloors() + ", and total people in the building is: "
                + getTotalPeople();
    }

}
