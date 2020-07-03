package camp.nextstep.edu.nextstep8.bowling;

public class Ready implements FrameStatus {
    private static final FrameStatusType type = FrameStatusType.READY;
    private static final String EMPTY = "";

    @Override
    public boolean isAcceptable(FrameStatusType type) {
        return this.type == type;
    }

    @Override
    public String getSymbol() {
        return EMPTY;
    }
}
