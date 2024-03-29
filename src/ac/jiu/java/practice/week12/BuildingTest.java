package ac.jiu.java.practice.week12;


public class BuildingTest {
    public static void main(String[] args) {
        Building JIU = new School("JIU", 300, 300, 4);
        School CGA = new School("CGA", 300, 300, 4);
        Building soccerField = new Stadium();




        //School이 빌딩의 자식 클래스이기 때문에 폴리몰피즘 선언은 가능하지만 school에 있는 메소드를 쓰기 위해서는 school 인스턴스라는 것을 확실히 해줘야 한다.
        ((School)JIU).setStudents("Meisam");




        // 학교에 있는 toString() 출력
        System.out.println(CGA);

        // security 인터페이스 출력되는지 확인
        CGA.securityCheck();


        // 학교에 학생 추가
        CGA.setStudents("Azaria");
        CGA.setStudents("Caca");
        // 교수 추가
        CGA.setProfessors("Wang");
        CGA.setProfessors("Jihoon");

        // 교수와 학생 출력
        System.out.println("The students member of the school is : ");
        displayStudents(JIU);

        System.out.println("The professors faculty of the school is : ");
        displayProfessors(CGA);

    }
    // display students
    public static void displayStudents(Building building) {
        if (building instanceof School) {
            for (String student : ((School)building).getStudents()) {
                System.out.println(student);
            }
        }
    }



    public static void displayProfessors(Building building) {
        if (building instanceof School) {
            for (String professor : ((School)building).getProfessor()) {
                System.out.println(professor);
            }
        }
    }
}
