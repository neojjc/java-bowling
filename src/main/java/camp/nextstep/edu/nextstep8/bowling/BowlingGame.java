package camp.nextstep.edu.nextstep8.bowling;

public class BowlingGame {
    private final Frames frames;
    private final Player player;
    private int currentFrame = 0;

    private BowlingGame(Player player) {
        this.player = player;
        this.frames = Frames.ready();
    }

    public static BowlingGame start(Player player) {
        return new BowlingGame(player);
    }

    public void record(int downPins) {
        if(frames.hasTry(currentFrame)) {
            frames.mark(currentFrame, downPins);
        }
        nextFrame();
    }

    public int getCurrentFrame() {
        return currentFrame;
    }

    public boolean next() {
        return !(frames.finalFrameIsDone());
    }

    public String getAllFrameScore() {
        return frames.generateAllFrameSymbols();
    }

    private void nextFrame() {
        if(frames.hasTry(currentFrame)) {
            return;
        }
        currentFrame++;
    }
}
