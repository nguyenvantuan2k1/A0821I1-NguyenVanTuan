package _8_cleancode_and_refactoring.exercise.refactoring;

public class TennisGame {
    public static String getScore(int scoreOfPlayer1, int scoreOfPlayer2) {
        String score = "";
        if (scoreOfPlayer1 == scoreOfPlayer2) {
            score = getString(scoreOfPlayer1);
        } else if (scoreOfPlayer1 >= 4 || scoreOfPlayer2 >= 4) {
            score = getString(scoreOfPlayer1, scoreOfPlayer2);
        } else {
            score = getString(scoreOfPlayer1, scoreOfPlayer2, score);
        }
        return score;
    }

    private static String getString(int scoreOfPlayer1, int scoreOfPlayer2) {
        String score;
        int minusResult = scoreOfPlayer1 - scoreOfPlayer2;
        if (minusResult == 1) score = "Advantage player1";
        else if (minusResult == -1) score = "Advantage player2";
        else if (minusResult >= 2) score = "Win for player1";
        else score = "Win for player2";
        return score;
    }

    private static String getString(int scoreOfPlayer1, int scoreOfPlayer2, String score) {
        int tempScore;
        StringBuilder scoreBuilder = new StringBuilder(score);
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = scoreOfPlayer1;
            else {
                scoreBuilder.append("-");
                tempScore = scoreOfPlayer2;
            }
            switch (tempScore) {
                case 0 -> scoreBuilder.append("Love");
                case 1 -> scoreBuilder.append("Fifteen");
                case 2 -> scoreBuilder.append("Thirty");
                case 3 -> scoreBuilder.append("Forty");
            }
        }
        score = scoreBuilder.toString();
        return score;
    }

    private static String getString(int scoreOfPlayer1) {
        return switch (scoreOfPlayer1) {
            case 0 -> "Love-All";
            case 1 -> "Fifteen-All";
            case 2 -> "Thirty-All";
            case 3 -> "Forty-All";
            default -> "Deuce";
        };
    }
}
