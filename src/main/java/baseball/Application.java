package baseball;
import java.util.ArrayList;
import java.util.List;


import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        boolean game = true;
        boolean win = true;
        HintMessage hintMessage = new HintMessage();
        RestartGameException restartGameException = new RestartGameException();
        Game game1 = new Game();
        while (game) {
            game1.startGame();
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            int inputNumber = Integer.parseInt(Console.readLine());
            if (restartGameException.hasRestartNumber(inputNumber)) {
                throw new IllegalArgumentException();
            }
            if (inputNumber == 1) {
                game = true;
            }
            if (inputNumber == 2) {
                game = false;
            }

//            ComputerNumber computerNumber = new ComputerNumber();
//            computerNumber.makeRandomNumber();
//            List<Integer> com = computerNumber.getComputerNumber();
//            for (Integer integer : com) {
//                System.out.print("computerValue = " + integer + " ");
//            }
//            System.out.println();
//
//            UserNumber userNumber = null;
//            List<Integer> user = null;
//            do {
//                userNumber = new UserNumber();
//                userNumber.makeUserNumber();
//                user = userNumber.getUserNumber();
//                win = hintMessage.checkPoint(user, com);
//            } while (win);
//
        }
    }
}
