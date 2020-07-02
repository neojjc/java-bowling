package camp.nextstep.edu.nextstep8.bowling;

import java.util.Objects;

public class Player {
    private static final int NAME_LIMIT = 3;
    private static final String EMPTY = "";
    private final String name;

    public Player(String name) {
        validateEmpty(name);
        validateLength(name);
        this.name = name;
    }

    public static Player of(String name) {
        return new Player(name);
    }

    public String getName() {
        return name;
    }

    private void validateEmpty(String name) {
        if(Objects.isNull(name) || EMPTY.equals(name)) {
            throw new IllegalArgumentException("이름 값을 확인해 주세요 공백이거나 없습니다");
        }
    }

    private void validateLength(String name) {
        if(NAME_LIMIT < name.length()) {
            throw new IllegalArgumentException(NAME_LIMIT + "을 초과하였습니다 이름 길이를 확인해 주세요");
        }
    }
}
