
package ohtu;

public class Player implements Comparable<Player> {
    private String name;
    private String nationality;
    private String team;
    private int goals;
    private int assists;

    public void setName(String name, String nationality, String team, int goals, int assists) {
        this.name = name;
        this.nationality = nationality;
        this.goals = goals;
        this.assists = assists;
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public String team() {
        return team;
    }

    public int getGoals() {
        return goals;
    }

    public int getAssists() {
        return assists;
    }

    public int getPoints() {
        return goals + assists;
    }

    @Override
    public int compareTo(Player comparePlayer) {
        return  comparePlayer.getPoints() - this.getPoints();
    }

    @Override
    public String toString() {
        return name + "    " + team + " " + goals + " + " + assists + " = " + (goals+assists);
    }
      
}
