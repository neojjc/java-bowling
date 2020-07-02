package camp.nextstep.edu.nextstep8.bowling;

public class FrameHolder {
    private final int current;

    public FrameHolder(int current) {
        this.current = current;
    }

    public FrameHolder next() {
        return new FrameHolder(current + 1);
    }

    public int getCurrent() {
        return current;
    }
}
