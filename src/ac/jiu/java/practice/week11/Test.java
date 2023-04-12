package ac.jiu.java.practice.week11;

public class Test {
    public static void main(String[] args) {
        Course courseIt = new Course();

        courseIt.setMajor("IT");
        courseIt.setLeader("Jihoon");
        System.out.println(courseIt + "\n" + "Please add specific courseIt in " + courseIt.getMajor());

        System.out.println();

        ObjectOrientedClass oop = new ObjectOrientedClass("IT", "Jihoon", 3, "Objected Oriented", false, "M302","Minjoo");

        oop.addStudents("Meisam");
        oop.addStudents("Raffin");
        oop.addStudents("Azaria");
        oop.addStudents("Caca");
        oop.addStudents("Kelvin");
        oop.addStudents("Danial");
        oop.addStudents("Kevin");
        oop.addStudents("Jeffery");
        oop.addStudents("Edo");
        oop.addStudents("Hegel");
        oop.addStudents("Clay");
        oop.addStudents("Theo");

        System.out.println(oop +"\n");
        System.out.println("Members of the " + oop.getName() + "is following: ");
        oop.displayStudents();
    }
}
