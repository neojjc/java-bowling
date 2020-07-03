package camp.nextstep.edu.nextstep8.bowling;

public class Gutter implements FrameStatus {
    private final FrameStatusType type = FrameStatusType.GUTTER;

    @Override
    public boolean isAcceptable(FrameStatusType type) {
        return this.type == type;
    }

    @Override
    public String getSymbol() {
        return "-";
    }
}
