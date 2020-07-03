package camp.nextstep.edu.nextstep8.bowling;

public class Miss implements FrameStatus {
    private final FrameStatusType type = FrameStatusType.MISS;
    private final int first;
    private final int second;

    public Miss(int first, int second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean isAcceptable(FrameStatusType type) {
        return this.type == type;
    }

    @Override
    public String getSymbol() {
        return first + "|" + second;
    }
}
