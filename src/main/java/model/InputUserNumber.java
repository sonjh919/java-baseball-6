/*
 * <pre>
 * Class : InputUserNumber
 * Comment: 사용자로부터 숫자를 입력받기
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

package model;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import vo.UserBall;

public class InputUserNumber {
    public static final int NUMBER_SIZE = 3;

    public static UserBall inputUserNumber() {
        String input = Console.readLine();

        if(input.length() != NUMBER_SIZE){
            throw new IllegalArgumentException();
        }

        List<Integer> userNumber = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            int inputNumber = input.charAt(i);

            if (inputNumber < 49 || inputNumber > 57) {
                throw new IllegalArgumentException();
            }
            if (userNumber.contains(inputNumber)){
                throw new IllegalArgumentException();
            }
            userNumber.add(input.charAt(i) - '0');
        }

        return new UserBall(userNumber);
    }
}
