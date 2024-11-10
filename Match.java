import java.util.ArrayList;

public class Match {
    private int team1Score;
    private int team2Score;
    private Team team1;
    private Team team2;
    private static ArrayList<Match> matches = new ArrayList<>();

    public Match(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
        matches.add(this);
    }

    public void issueCard(Team team, int shirtNo, String cardColor) {
        for (Player p : team.getPlayers()) {
            if (p.getShirtNo() == shirtNo) {
                if (cardColor.equalsIgnoreCase("yellow")) {
                    ++p.getCards()[1]; // Increment yellow card count
                } else if (cardColor.equalsIgnoreCase("red")) {
                    ++p.getCards()[2]; // Increment red card count
                }
                ++p.getCards()[0]; // Increment total card count
                break; // Exit loop after finding and updating the player
            }
        }
    }


    public void setPoints(int team1Score, int team2Score) {
        this.team1Score = team1Score;
        this.team2Score = team2Score;
    }

    public void runMatch() {
    }

    public Team getTeam1() {
        return team1;
    }

    public void setTeam1(Team team1) {
        this.team1 = team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public void setTeam2(Team team2) {
        this.team2 = team2;
    }

    public static ArrayList<Match> getMatches() {
        return matches;
    }
}
