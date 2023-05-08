package ac.jiu.java.practice.week13Example;

import java.util.ArrayList;

public class TestClassroom {

    public static void main(String[] args) {

        Classroom team1 = new Team("Team IT");

        Classroom team2 = new NotTeam();



        ((Team)team1).setTeamMembers("Hegel");

        team2.setStudents("Azaria");

        displayTeam(team2);

    }

    public static void displayTeam(Classroom classroom) {

        if (classroom instanceof Team) {
            for(String team : ((Team) classroom).getTeamMembers()) {
                System.out.println(team);
            }
        }

    }
}
