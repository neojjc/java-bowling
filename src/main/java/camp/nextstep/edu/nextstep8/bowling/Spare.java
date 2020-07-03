package camp.nextstep.edu.nextstep8.bowling;

public class Spare implements FrameStatus {
    private final FrameStatusType type = FrameStatusType.SPARE;
    private final int first;

    public Spare(int first) {
        this.first = first;
    }

    @Override
    public boolean isAcceptable(FrameStatusType type) {
        return this.type == type;
    }

    @Override
    public String getSymbol() {
        return first + "|/";
    }
}
