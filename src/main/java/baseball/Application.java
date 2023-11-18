package baseball;

import baseball.Controller.BaseballGameController;

public class Application {
    public static void main(String[] args) throws IllegalAccessException {
        BaseballGameController baseballGameController = new BaseballGameController();
        baseballGameController.run();
    }
}


