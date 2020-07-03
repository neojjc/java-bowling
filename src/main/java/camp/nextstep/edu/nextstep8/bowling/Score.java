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
        checkRange(downPins);
        checkMaxScore(downPins);
        setScore(downPins);

        return makeStatus();
    }

    public boolean isMaxScore() {
        return first == MAX_SCORE ||
                (first + second) == MAX_SCORE;
    }

    private void setScore(int downPins) {
        if(INIT_SCORE == first) {
            first = downPins;
            return;
        }
        second = downPins;
    }

    private FrameStatus makeStatus() {
        if (MAX_SCORE == first) {
            return new Strike();
        }

        if (MAX_SCORE == (first + second)) {
            return new Spare(first);
        }

        if (0 == (first + second)) {
            return new Gutter();
        }

        return new Miss(first, second);
    }

    private void checkRange(int downPins) {
        if(MAX_SCORE < downPins || 0 > downPins) {
            throw new IllegalArgumentException("0 에서 " + MAX_SCORE + " 사이 값만 가능합니다");
        }
    }

    private void checkMaxScore(int downPins) {
        if(MAX_SCORE < first + downPins) {
            throw new IllegalArgumentException(MAX_SCORE + "점 을 넘을 수 없습니다");
        }
    }
 }
