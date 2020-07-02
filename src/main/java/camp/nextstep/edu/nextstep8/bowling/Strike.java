package camp.nextstep.edu.nextstep8.bowling;

public class Strike implements FrameStatus {
    private final FrameStatusType type = FrameStatusType.STRIKE;

    @Override
    public boolean isAcceptable(FrameStatusType type) {
        return this.type == type;
    }

    @Override
    public String getSymbol() {
        return "X";
    }
}
