package Generics;

interface Player {} // because records can implement interfaces but cant extend classes!

record BaseballPlayer(String name, String position) implements Player{}

record FootballPlayer(String name, String position) implements Player{}

public class Main {

    public static void main(String[] args) {

        SportsTeam fillies1 = new SportsTeam("Philadelphia fillies");
        SportsTeam astros1 = new SportsTeam("Indian-poop astros");
        scoreResult(fillies1, 3, astros1, 5);

        BaseballTeam fillies2 = new BaseballTeam("Philadelphia fillies");
        BaseballTeam astros2 = new BaseballTeam("Indian-poop astros");
        scoreResult(fillies2, 3, astros2, 5);

        // Using generics --> Team Class
        Team<BaseballPlayer> fillies = new Team<>("Philadelphia fillies");
        Team<BaseballPlayer> astros = new Team<>("Indian-poop astros");
        scoreResult(fillies, 3, astros, 5);

        var harper = new BaseballPlayer("Pajeet Harper", "Right Fielder");
        var marsh = new BaseballPlayer("Mr. Marsh Skibob", "Right Fielder");
        fillies.addTeamMember(harper);
        fillies.addTeamMember(marsh);
        fillies.listTeamMembers();
// problem (Both football player and baseball player could be added to the same team which is wrong!) --> generics give us the solution
        var guthrie = new BaseballPlayer("D Guthrie", "Center Fielder");
        fillies.addTeamMember(guthrie);

        SportsTeam afc1 = new SportsTeam("Adelaide Crows");
        Team<FootballPlayer> afc = new Team<>("Adelaide Crows");
        var tex = new FootballPlayer("Tex Walker", "Centre half forward");
        afc.addTeamMember(tex);
        var rory = new FootballPlayer("Rory Laird", "Midfield");
        afc.addTeamMember(rory);
        afc.listTeamMembers();
    }

    public static void  scoreResult(BaseballTeam team1, int team1_score, BaseballTeam team2, int team2_score) {

        String message = team1.setScore(team1_score, team2_score);
        team2.setScore(team2_score, team1_score);

        System.out.printf("%s %s %s %n", team1, message, team2);
    }

    public static void  scoreResult(SportsTeam team1, int team1_score, SportsTeam team2, int team2_score) {

        String message = team1.setScore(team1_score, team2_score);
        team2.setScore(team2_score, team1_score);

        System.out.printf("%s %s %s %n", team1, message, team2);
    }

    public static void  scoreResult(Team team1, int team1_score,
                                    Team team2, int team2_score) {

        String message = team1.setScore(team1_score, team2_score);
        team2.setScore(team2_score, team1_score);

        System.out.printf("%s %s %s %n", team1, message, team2);
    }


}
