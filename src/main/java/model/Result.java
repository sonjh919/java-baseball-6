/*
 * <pre>
 * Class : Result
 * Comment: 제시된 난수와 사용자가 입력한 수를 비교
 * History
 * ================================================================
 * DATE             AUTHOR           NOTE
 * ----------------------------------------------------------------
 * 2023-10-22       손준형           최초 생성
 * 2023-10-23       손준형           난수와 사용자 입력, 반환값에 대해 일급 컬렉션 적용
 * 2023-10-23       손준형           매직넘버 상수 대체
 * </pre>
 *
 * @author 손준형
 * @version 1.0.1
 * @see
 */

package model;

import java.util.List;
import vo.AnswerBall;
import vo.ResultBall;
import vo.UserBall;

public class Result {
    public static final int NUMBER_SIZE = 3;

    public static ResultBall getResult(AnswerBall answerBall, UserBall userBall) {
        List<Integer> answer = answerBall.getAnswerBall();
        List<Integer> user = userBall.getUserBall();
        int strike = 0;
        int ball = 0;
        for (int i = 0; i < NUMBER_SIZE; i++) {
            if (answer.get(i) == user.get(i)) {
                strike++;
            } else if (user.contains(answer.get(i))) {
                ball++;
            }
        }
        return new ResultBall(strike, ball);
    }
}
