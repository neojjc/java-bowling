package camp.nextstep.edu.nextstep8.bowling;

public class BowlingGameApplication {
    public static void main(String[] args) {
        String name = BowlingGameInput.getPlayerName();
        Player.of(name);
        BowlingGame bowlingGame = new BowlingGame();

        int downPins;
        while (bowlingGame.hasNextFrame()) {
            BowlingGameView.showDashboard(player, bowlingGame.getScoreBoard());
            downPins = BowlingGameInput.rollUp(bowlingGame.getCurrentFrame());
            bowlingGame.record(downPins);
        }
    }
}
