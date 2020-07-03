package camp.nextstep.edu.nextstep8.bowling;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Frames {
    private static final int LAST_FRAME = 11;
    private final List<Frame> frames;

    private Frames() {
        this.frames = initFrames();
    }

    public static Frames ready() {
        return new Frames();
    }

    public void mark(int currentFrame, int downPins) {
        getCurrentFrame(currentFrame)
                .markDownPins(downPins);
    }

    public boolean hasTry(int currentFrame) {
        return !(getCurrentFrame(currentFrame).isDone());
    }

    private List<Frame> initFrames() {
        List<Frame> frames = new ArrayList<>();
        IntStream.range(0, LAST_FRAME)
                .forEach(i -> frames.add(new Frame()));
        return frames;
    }

    private Frame getCurrentFrame(int currentFrame) {
        return frames.get(currentFrame);
    }

    public boolean finalFrameIsDone() {
        return frames.get(LAST_FRAME - 1).isDone();
    }

    public String generateAllFrameSymbols() {
        return frames.stream()
                .map(f -> f.getFrameSymbol())
                .collect(Collectors.joining("\t|\t"));
    }
}
