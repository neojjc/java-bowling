package camp.nextstep.edu.nextstep8.bowling;

public class BowlingGameApplication {
    public static void main(String[] args) {
        String name = BowlingGameInput.getPlayerName();
        Player player = Player.of(name);
        BowlingGame bowlingGame = BowlingGame.start(player);

        int downPins;
        while (bowlingGame.next()) {
            System.out.println(bowlingGame.getAllFrameScore());
            downPins = BowlingGameInput.rollUp(bowlingGame.getCurrentFrame());
            bowlingGame.record(downPins);
        }
    }
}
