package camp.nextstep.edu.nextstep8.bowling;

public class Frame {
    private final Score score;
    private FrameStatus status;
    private int trying;

    public Frame() {
        this.score = new Score();
    }

    public void markDownPins(int downPins) {
        // status 를 결정
        // addTrying
        status = score.record(downPins); // MISS, SPARE, STRIKE, GUTTER
        // status 는 출력 내용을 결정 한다
    }

    // frame status를 가진다
    // frame의 print symbol을 요청하면 status.getSymbol()을 반환한다
    //

}
