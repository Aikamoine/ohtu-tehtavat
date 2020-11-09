package ohtu;

public class Player implements Comparable<Player>{

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
        return String.format("%-20s", name) + team + "   " + String.format("%3s", goals) + " + " + 
                String.format("%2s", assists) + " = " + String.format("%2s", getPoints());
    }

    public int getGoals() {
        return goals;
    }
    
    public int getAssists() {
        return assists;
    }
    
    Object getNationality() {
        return nationality;
    }

    public int getPoints() {
        return goals + assists;
    }
    
    @Override
    public int compareTo(Player verrokki) {
        int pisteita = getPoints();
        int verrokkipisteita = verrokki.getPoints();
        
        if (pisteita == verrokkipisteita) {
            return verrokki.getGoals() - goals;
        }
        
        return verrokkipisteita - pisteita;
    }

}
