import controller.RacingController;

import java.io.IOException;

public class RacingMain {

    public static void main(String[] args) throws IOException {
        // TODO: MVC 패턴을 기반으로 자동차 경주 미션 구현해보기
        final var racingController = new RacingController();
        racingController.run();
    }
}
