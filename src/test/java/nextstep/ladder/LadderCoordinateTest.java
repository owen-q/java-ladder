package nextstep.ladder;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LadderCoordinateTest {

    @Test
    void create() {
        LadderCoordinate somePoint = LadderCoordinate.of(0, 1, 0);

    }

    @DisplayName("높이가 다르면 같은 선상에 위치할 수 없다")
    @Test
    void maybeLocatedOnSameLine_different_height() {
        LadderCoordinate somePoint = LadderCoordinate.of(2, 3, 1);
        LadderCoordinate otherPoint = LadderCoordinate.of(2, 3, 2);

        Assertions.assertThat(somePoint.maybeLocatedOnSameLine(otherPoint)).isFalse();
    }


    @DisplayName("같은 높이에서 시작점이 같으면 같은 선상에 위치하게된다")
    @Test
    void maybeLocatedOnSameLine_same_startpoint() {
        LadderCoordinate somePoint = LadderCoordinate.of(2, 3, 1);
        LadderCoordinate otherPoint = LadderCoordinate.of(3, 4, 1);

        Assertions.assertThat(somePoint.maybeLocatedOnSameLine(otherPoint)).isTrue();
    }


    @DisplayName("같은 높이에서 끝점이 같으면 같은 선상에 위치하게된다")
    @Test
    void maybeLocatedOnSameLine_same_endpoint() {
        LadderCoordinate somePoint = LadderCoordinate.of(2, 3, 1);
        LadderCoordinate otherPoint = LadderCoordinate.of(1, 2, 1);

        Assertions.assertThat(somePoint.maybeLocatedOnSameLine(otherPoint)).isTrue();
    }





}
