package nextstep.ladder;

public class LadderCoordinate {
    private final int startPoint;
    private final int endPoint;
    private final int height;

    public LadderCoordinate(int startPoint, int endPoint, int height) {
        if (Math.abs(startPoint - endPoint) != 1) {
            throw new IllegalArgumentException("사다리의 위치를 표기하기 위해서는 길이가 1이어야 합니다");
        }

        this.startPoint = startPoint;
        this.endPoint = endPoint;
        this.height = height;
    }

    public static LadderCoordinate of(int startPoint, int endPoint, int height) {
        return new LadderCoordinate(startPoint, endPoint, height);
    }

    public boolean maybeLocatedOnSameLine(int startPoint, int endPoint, int height) {
        if (this.height != height) {
            return false;
        }

        return this.startPoint == startPoint || this.startPoint == endPoint || this.endPoint == startPoint || this.endPoint == endPoint;
    }

    public boolean maybeLocatedOnSameLine(LadderCoordinate otherCoordinate) {
        if (this.height != otherCoordinate.height) {
            return false;
        }

        return this.startPoint == otherCoordinate.startPoint || this.startPoint == otherCoordinate.endPoint || this.endPoint == otherCoordinate.startPoint || this.endPoint == otherCoordinate.endPoint;
    }

}
