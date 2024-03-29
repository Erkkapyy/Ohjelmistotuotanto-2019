package ohtu;

public class TennisGame {
    
    private int m_score1 = 0;
    private int m_score2 = 0;
    private String player1Name;
    private String player2Name;

    public TennisGame(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName == "player1")
            m_score1 += 1;
        else
            m_score2 += 1;
    }

    public String getEvenScore() {
        switch (m_score1)
        {
            case 0:
                    return "Love-All";
            case 1:
                    return "Fifteen-All";
            case 2:
                    return "Thirty-All";
            case 3:
                    return "Forty-All";
            default:
                    return "Deuce";
            
        }
    }

    public String getAdvantage(int scoreDifference) {
        if (scoreDifference==1) return "Advantage " + this.player1Name;
        return "Advantage " + this.player2Name;
    }

    public String getWinner(int scoreDifference) {
        if (scoreDifference>=2) return "Win for " + this.player1Name; 
        return "Win for " + this.player2Name;
    }

    public String humanizeScore(int score) {
        switch(score) {
        case 0:
            return "Love";
            case 1:
            return "Fifteen";
            case 2:
            return "Thirty";
            default:
            return "Forty";
        }
    }

    public String getScore() {
        if (m_score1 == m_score2) { 
            return getEvenScore();
        } else if (m_score1 >= 4 || m_score2 >= 4) {
            int scoreDifference = m_score1 - m_score2;
            if (scoreDifference == 1 || scoreDifference == -1) return getAdvantage(scoreDifference);
            return getWinner(scoreDifference);
        } else {
            return humanizeScore(m_score1) + "-" + humanizeScore(m_score2);
        }
    }
}