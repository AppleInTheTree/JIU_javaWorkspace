package ac.jiu.java.practice.week11;


public class Q1_CourseTest {
    public static void main(String[] args) {
        Q1_Course courseIt = new Q1_Course();

        courseIt.setMajor("IT");
        courseIt.setLeader("Jihoon");
        System.out.println(courseIt + "\n" + "Please add specific courseIt in " + courseIt.getMajor());

        System.out.println();

        Q1_SpecificCourse objectOriented = new Q1_SpecificCourse("IT", "Jihoon", 3, "Object Oriented", false, "M302","Minjoo");
        Q1_SpecificCourse calculus = new Q1_SpecificCourse("IT", "Jihoon", 3, "Calculus", true, "M302", "Euijin");


        objectOriented.addStudents("Meisam");
        objectOriented.addStudents("Raffin");
        objectOriented.addStudents("Azaria");
        objectOriented.addStudents("Caca");
        objectOriented.addStudents("Kelvin");
        objectOriented.addStudents("Danial");
        objectOriented.addStudents("Kevin");
        objectOriented.addStudents("Jeffery");
        objectOriented.addStudents("Edo");
        objectOriented.addStudents("Hegel");
        objectOriented.addStudents("Clay");
        objectOriented.addStudents("Theo");

        // oop 클래스에 있는 학생들 수학 수업에 넣기
        for (int i = 0; i < objectOriented.getNumOfStudents(); i++) {
            calculus.addStudents(objectOriented.getStudents().get(i));
        }



        System.out.println(objectOriented +"\n");
        System.out.println("Members of the " + objectOriented.getName() + "is following: ");
        objectOriented.displayStudents();
        System.out.println();

        System.out.println(calculus + "\n");
        System.out.println("Members of the " + calculus.getName() + "is following: ");
        calculus.displayStudents();

    }
}
