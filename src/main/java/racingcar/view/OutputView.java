package racingcar.view;

import java.util.List;

public class OutputView {

    public static final String PRINT_UNIT = "-";
    public static final String NAME_RESULT_SEPARATOR = " : ";
    public static final String WINNER_SEPARATOR = ", ";

    public static void inputNotValid() {
        System.out.println("입력이 올바르지 않습니다.");
    }

    public static void inputNameDuplicate() {
        System.out.println("입렵된 차이름에 중복이 있습니다.");
    }

    public static void inputTimeNotValid() {
        System.out.println("입력된 횟수가 숫자가 아닙니다.");
    }

    public static void result() {
        System.out.println("실행 결과");
    }


    public static void printCurrentLocation(String name, int position) {
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < position; i++) {
            buffer.append(PRINT_UNIT);
        }
        System.out.println(name + NAME_RESULT_SEPARATOR + buffer);
    }

    public static void announceWinner(List<String> winners) {
        System.out.println("최종 우승자 : " + String.join(WINNER_SEPARATOR, winners));
    }
}
