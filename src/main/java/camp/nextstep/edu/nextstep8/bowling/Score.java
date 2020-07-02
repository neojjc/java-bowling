package camp.nextstep.edu.nextstep8.bowling;

public class Score {
    private static final int MAX_SCORE = 10;
    private static final int INIT_SCORE = -1;

    private int first;
    private int second;

    public Score() {
        first = INIT_SCORE;
        second = INIT_SCORE;
    }

    public FrameStatus record(int downPins) {
        validateRange(downPins);
        validateMaxScore(downPins);

        if(INIT_SCORE == first) {
            first = downPins;
        }

        second = downPins;

        return makeStatus();
    }

    private FrameStatus makeStatus() {
        if (MAX_SCORE == first) {
            return new Strike();
        }

        if (MAX_SCORE == (first + second)) {
            return new Spare(first);
        }

        if (0 == (first + second)) {
            return new Gutter()
        }

        return new Miss(first, second);
    }

    private void validateRange(int downPins) {
        if(MAX_SCORE < downPins) {
            throw new IllegalArgumentException(MAX_SCORE + "점 을 넘을 수 없습니다");
        }
    }
 }
