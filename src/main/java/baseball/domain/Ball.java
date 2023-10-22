package baseball.domain;

import java.util.Objects;

public class Ball {
    private static final int ZERO_COUNT = 0;
    private static final int MAX_COUNT = 3;
    private static final String BALL_RANGE_EXCEPTION_MESSAGE = "볼의 유효 범위는 0~3 입니다.";
    private final int ball;

    public Ball(int ball) {
        validateBallRange(ball);
        this.ball = ball;
    }

    private static void validateBallRange(int ball) {
        if (ball < ZERO_COUNT || MAX_COUNT < ball) {
            throw new IllegalArgumentException(BALL_RANGE_EXCEPTION_MESSAGE);
        }
    }

    int getValue() {
        return this.ball;
    }

    public boolean isEmpty() {
        return ball == ZERO_COUNT;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Ball ball1)) {
            return false;
        }
        return ball == ball1.ball;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ball);
    }
}
