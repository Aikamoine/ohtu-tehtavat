package ohtu;

import java.util.HashMap;

public class TennisGame {
    
    private int player1Score = 0;
    private int player2Score = 0;
    private String player1Name;
    private String player2Name;
    private HashMap<Integer, String> scoreWords;

    public TennisGame(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
        
        scoreWords = new HashMap<>();
        scoreWords.put(0, "Love");
        scoreWords.put(1, "Fifteen");
        scoreWords.put(2, "Thirty");
        scoreWords.put(3, "Forty");
    }

    public void wonPoint(String playerName) {
        if (playerName == player1Name)
            player1Score += 1;
        else
            player2Score += 1;
    }

    private String getEvenScore() {
        if (player1Score > 3) {
            return "Deuce";
        } else {
            return scoreWords.get(player1Score) + "-All";
        }
    }
    
    private String getEndgameResults() {
        int minusResult = player1Score-player2Score;

        if (minusResult == 1) {
            return "Advantage player1";
        } else if (minusResult == -1) {
            return "Advantage player2";
        } else if (minusResult >= 2) {
            return "Win for player1";
        } else {
            return "Win for player2";
        }
    }
        
    public String getScore() {
        if (player1Score==player2Score) {
            return getEvenScore();
        } else if (player1Score>=4 || player2Score>=4) {
            return getEndgameResults();
        }

        return scoreWords.get(player1Score) + "-" + scoreWords.get(player2Score);
    }
}