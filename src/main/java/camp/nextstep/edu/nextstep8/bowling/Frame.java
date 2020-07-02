package camp.nextstep.edu.nextstep8.bowling;

public class Frame {
    private final Score score;
    private FrameStatus status; //
    private int trying;

    public Frame() {
        this.score = new Score();
    }

    public void markDownPins(int downPins) {
        // status를 결정
        // addTrying
        status = score.record(downPins); // MISS, SPARE, STRIKE, GUTTER
        // status는 출력 내용을 결정한다
    }
}
