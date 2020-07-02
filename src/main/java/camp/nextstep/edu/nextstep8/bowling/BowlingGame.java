package camp.nextstep.edu.nextstep8.bowling;

import java.util.HashMap;
import java.util.Map;

public class BowlingGame {
    private static final int LAST_FRAME = 11;

    private final Player player;
    private int currentFrame = 1;

    private final Map<Integer, Frame> frames = new HashMap<>();

    public void record(int downPins) {
        startFrame(downPins);

        frames.put(currentFrame, new Frame(downPins));


        if(10 == downPins) {
            currentFrame++;
        }

        frames.get(currentFrame)
                .updateSpare(downPins);

        if(meetEndCondition()){
            endFrame();
        }
    }



    public BowlingGame start(Player player) {
        this.player = player;

    }

    public void roll() {
        markScore(BowlingGameInput.getHitCount(currentFrame));
        if(hasSpareChance()) {
            markSpare(BowlingGameInput.getHitCount(currentFrame));
        }
        currentFrame++;
    }

    public int getCurrentFrame() {
        return currentFrame;
    }

    private void markScore(int score) {
        frames.put(currentFrame, new Frame(score));
    }

    private void markSpare(int spare) {
        frames.get(currentFrame)
                .updateSpare(spare);
    }

    private boolean hasSpareChance() {
        return frames.get(currentFrame).hasSpareChance();
    }

    public boolean hasNextFrame() {
        return LAST_FRAME > this.currentFrame;
    }

    public boolean hasLastChance() {
        int lastFrameIndex = currentFrame - 1;
        return LAST_FRAME == this.currentFrame &&
                frames.get(lastFrameIndex)
                        .isStrikeOrSpare();
    }

    public ScoreBoard getScoreBoard() {
        return new ScoreBoard(frames);
    }
}
