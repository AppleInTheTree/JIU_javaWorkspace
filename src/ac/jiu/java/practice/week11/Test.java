package ac.jiu.java.practice.week11;

public class Test {
    public static void main(String[] args) {
        Course course = new Course();
        course.setMajor("IT");
        course.setInstructor("Jihoon");
        System.out.println(course.toString() + "\n" + "Please add specific course in " + course.getMajor());

        System.out.println();

        ObjectOrientedClass oop = new ObjectOrientedClass("IT", "Jihoon", "Objected Oriented", false, "M302","Minjoo");

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

        System.out.println(oop.toString());
        System.out.println("Members of the " + oop.getName() + "is following: ");
        oop.displayStudents();
    }
}
