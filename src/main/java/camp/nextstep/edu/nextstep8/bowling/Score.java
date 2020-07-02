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

        if(INIT_SCORE == first) {
            first = downPins;
        }

        second = downPins;
        return new FrameStatus();
    }

    private void validateRange(int downPins) {
        if(MAX_SCORE < downPins) {
            throw new IllegalArgumentException(MAX_SCORE + "점 을 넘을 수 없습니다");
        }
    }
 }
