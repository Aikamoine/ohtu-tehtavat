package ohtu;

public class Player {

    private int goals;
    private int assists;
    private String name;
    private String team;
    private String nationality;

    public void setName(String team, String name, int goals, int assists, String nationality) {
        this.team = team;
        this.name = name;
        this.goals = goals;
        this.assists = assists;
        this.nationality = nationality;
    }

    public String getName() {
        return team;
    }

    @Override
    public String toString() {
        return name + " joukkueesta " + team + ": " + goals + " maalia, " + assists + " syöttöä";
    }

    Object getNationality() {
        return nationality;
    }

}
