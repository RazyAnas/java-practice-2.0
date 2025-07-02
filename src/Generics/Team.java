package Generics;

import java.util.ArrayList;
import java.util.List;

record Affiliation(String name, String type, String countryCode) {

    @Override
    public String toString() {
        return name + " (" + type + " in " + countryCode + ")";
    }
}

// generics --> dealing with player instances predominantly, as the team members.
// T stands for player --> football or baseball player
public class Team<T extends Player, S> { // this doesn't mean type T it extends Player, it means parameterized type T, has to be a Player or a subtype of Player. This is called upper bound

    private String teamName;
    private List<T> teamMembers = new ArrayList<>();
    private int totalWins = 0;
    private int totalLosses = 0;
    private int totalTies = 0;
    private S affiliation;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public Team(S affiliation, String teamName) {
        this.affiliation = affiliation;
        this.teamName = teamName;
    }

    public void  addTeamMember(T t) {

        if (!teamMembers.contains(t)) {
            teamMembers.add(t);
        }
    }

    public void listTeamMembers() {

        System.out.println(teamName + " Roster:");
        System.out.println((affiliation == null ? "" : " AFFILIATION: " + affiliation)); // what is affiliation? --> it could be anything A string, StringBuilder, an interface or even a class or a record
        for (T t : teamMembers) {
            System.out.println(t.name());
        }
    }

    public int ranking() {

        return (totalLosses * 2) + totalTies + 1; // how well one team is doing compared to another
    }

    public String setScore(int ourScore, int theirScore) {

        String message = "lost to";

        if (ourScore > theirScore) {
            totalWins++;
            message = "beat";
        } else if (ourScore == theirScore) {
            totalTies++;
            message = "tied";
        } else {
            totalLosses++;
        }

        return message;

    }

    @Override
    public String toString() {
        return teamName + " (Ranked " + ranking() + ")";
    }
}
