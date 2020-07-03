package camp.nextstep.edu.nextstep8.bowling;

public class Frame {
    private final static int MAX_TRY_CHANCE = 2;

    private final Score score;
    private FrameStatus status;
    private int trying;

    public Frame() {
        this.score = new Score();
        this.status = new Ready();
    }

    public void markDownPins(int downPins) {
        trying++;
        status = score.record(downPins);
    }

    public String getFrameSymbol() {
        return status.getSymbol();
    }

    public boolean isDone() {
        return !(hasTryChance()) || score.isMaxScore();
    }

    private boolean hasTryChance() {
        return (MAX_TRY_CHANCE > trying);
    }
}
