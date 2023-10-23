/*
 * <pre>
 * Class : ResultView
 * Comment: 사용자 입력과 난수를 비교한 결과 출력
 * History
 * ================================================================
 * DATE             AUTHOR           NOTE
 * ----------------------------------------------------------------
 * 2023-10-22       손준형           최초 생성
 * </pre>
 *
 * @author 손준형
 * @version 1.0.0
 * @see
 */

package view;

import vo.ResultBall;

public class ResultView {

    public static Boolean resultView(ResultBall resultBall) {
        int strike = resultBall.getStrike();
        int ball = resultBall.getBall();
        if (strike == 3) {
            System.out.println(
                    "3스트라이크\n"
                            + "3개의 숫자를 모두 맞히셨습니다! 게임 종료\n"
                            + "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            return true;
        } else if (strike == 0 && ball == 0) {
            System.out.println("낫싱");
        } else if (0 <= strike && strike <= 2 && 0 <= ball && ball <= 2) {
            System.out.println(ball + "볼 " + strike + "스트라이크");
        }
        return false;
    }
}
