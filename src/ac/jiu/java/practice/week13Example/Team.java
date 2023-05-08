package ac.jiu.java.practice.week13Example;
import java.time.temporal.Temporal;
import java.util.*;

public class Team extends Classroom implements Contest{

    // properties
    private ArrayList<String> teamMembers;

    Team() {

        teamMembers = new ArrayList<>();
    }

    Team(String name) {
        super(name);
        teamMembers = new ArrayList<>();
    }


    public ArrayList<String> getTeamMembers() {
        return this.teamMembers;
    }
    public void setTeamMembers(String teamMembers) {
        this.teamMembers.add(teamMembers);
    }





    @Override
    public String toString() {
        return "Hi";
    }


    @Override
    public boolean checkContest() {
        return true;
    }
}
