package camp.nextstep.edu.nextstep8.bowling;

public interface FrameStatus {
    boolean isAcceptable(FrameStatusType type);
    String getSymbol();
}
